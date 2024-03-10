package com.clickstream.data.rowmapper;

import org.openapitools.model.EventResponse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EventResponseMapper implements RowMapper<EventResponse>{
    public EventResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
        EventResponse eventResponse = new EventResponse();
        eventResponse.setId(rs.getString("id"));
        eventResponse.setPointer(rs.getString("pointer"));
        eventResponse.setPageURL(rs.getString("page_url"));
        eventResponse.setType(rs.getString("type"));
        eventResponse.setElementClass(rs.getString("element_class"));
        eventResponse.setElementId(rs.getString("element_id"));
        eventResponse.setElementName(rs.getString("element_name"));
        eventResponse.setElementText(rs.getString("element_text"));
        eventResponse.setCreatedTime(rs.getString("created_date"));
        return eventResponse;
    }
}
