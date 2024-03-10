package com.clickstream.service;

import com.clickstream.data.dao.EventDao;
import org.openapitools.model.EventRequest;
import org.openapitools.model.EventResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    Logger logger = LoggerFactory.getLogger(EventService.class);
    @Autowired
    EventDao eventDao;
    public String createEvent(EventRequest eventRequest) {
        return eventDao.createEventData(eventRequest);
    }
    public List<EventResponse> fetchEvents(String id) {
        return eventDao.fetchEventsbyFilters(id);
    }

}
