package com.clickstream.data.dao;

import com.clickstream.data.rowmapper.EventResponseMapper;
import com.clickstream.util.ClickstreamAPIUtil;
import org.openapitools.model.EventRequest;
import org.openapitools.model.EventResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EventDao {

    Logger logger = LoggerFactory.getLogger(EventDao.class);

    final String sqlCreateEvent = "insert into event (id, type, pointer, page_url, element_class, " +
            "element_id, element_name, element_text, created_date) " +
            "values " +
            "(:id, :type, :pointer, :page_url, :element_class, :element_id, :element_name, :element_text, " +
            ":created_date);";

    final String sqlFetchEvent = "select id, type, pointer, page_url, element_class, " +
            "element_id, element_name, element_text, created_date " +
            "from event " +
            "where id = :id " +
            ";";
    private DataSource dataSource;

    //Datasource bean is injected
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String createEventData(EventRequest eventRequest) {
        logger.info("## createEventData inside DAO");

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        String currentDateString = offsetDateTime.format(DateTimeFormatter.ISO_DATE_TIME);

        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        Map<String, Object> params = getStringObjectMap(eventRequest, currentDateString);

        int result = namedParameterJdbcTemplate.update(sqlCreateEvent, params);

        String idLocal = (String) params.get("id");
        if (result != 0) {
            logger.info("Event created with id " + idLocal);
            return idLocal;
        } else {
            logger.error("Event creation failed with id " + idLocal);
            return null;
        }
    }

    public List<EventResponse> fetchEventsbyFilters(String id) {
        logger.info("## fetchEventsbyFilters");
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("id", id);
        return namedParameterJdbcTemplate.query(sqlFetchEvent, params, new EventResponseMapper());
    }

    private static Map<String, Object> getStringObjectMap(EventRequest eventRequest, String currentDateString) {
        Map<String,Object> params = new HashMap<String,Object>();

        params.put("id", ClickstreamAPIUtil.getId());
        params.put("type", eventRequest.getType());
        params.put("pointer", eventRequest.getPointer());
        params.put("page_url", eventRequest.getPageURL());
        params.put("element_class", eventRequest.getElementClass());
        params.put("element_id", eventRequest.getElementId());
        params.put("element_name", eventRequest.getElementName());
        params.put("element_text", eventRequest.getElementText());
        params.put("created_date", currentDateString);
        return params;
    }
}
