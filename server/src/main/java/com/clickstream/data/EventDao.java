package com.clickstream.data;

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
import java.util.Map;

@Service
public class EventDao {

    Logger logger = LoggerFactory.getLogger(EventDao.class);

    final String sqlCreateEvent = "insert into event (id, type, pointer, page_url, element_class, " +
            "element_id, element_name, element_text, created_date, created_by, updated_date, updated_by) " +
            "values " +
            "(:id, :type, :pointer, :page_url, :element_class, :element_id, :element_name, :element_text, " +
            ":created_date, :created_by, :updated_date, :updated_by);";

    private DataSource dataSource;

    //Datasource bean is injected
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    String createEventData(EventRequest eventRequest) {
        logger.info("## createEventData inside DAO");

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        String currentDateString = offsetDateTime.format(DateTimeFormatter.ISO_DATE_TIME);

        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        Map<String, Object> params = getStringObjectMap(eventRequest, currentDateString);

        int result = namedParameterJdbcTemplate.update(sqlCreateEvent, params);
        if (result != 0) {
            logger.info("Event created with id " + eventRequest.getId());
            return eventRequest.getId();
        } else {
            logger.error("Event creation failed with id " + eventRequest.getId());
            return null;
        }

    }

    private static Map<String, Object> getStringObjectMap(EventRequest eventRequest, String currentDateString) {
        Map<String,Object> params = new HashMap<String,Object>();

        params.put("id", eventRequest.getId());
        params.put("type", eventRequest.getType());
        params.put("pointer", eventRequest.getPointer());
        params.put("page_url", eventRequest.getPageURL());
        params.put("element_class", eventRequest.getElementClass());
        params.put("element_id", eventRequest.getElementId());
        params.put("element_name", eventRequest.getElementName());
        params.put("element_text", eventRequest.getElementText());
        params.put("created_date", currentDateString);
        params.put("created_by", "SYSTEM");
        params.put("updated_date", "");
        params.put("updated_by", "");
        return params;
    }
}
