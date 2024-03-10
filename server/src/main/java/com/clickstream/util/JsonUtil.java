package com.clickstream.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtil {
    static Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    public static String getJsonFromObject(Object obj) {
        ObjectMapper converter = new ObjectMapper();
        converter.registerModule(new JavaTimeModule());
        try {
            return converter.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
