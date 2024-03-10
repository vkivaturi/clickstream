package com.clickstream.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

public class ClickstreamAPIUtil {
    static Logger logger = LoggerFactory.getLogger(ClickstreamAPIUtil.class);

    public static void setResponse(NativeWebRequest req, String jsonData) {
        logger.info("## setResponse is creating the response message");
        String contentType = "application/json";
        try {
            HttpServletResponse res = req.getNativeResponse(HttpServletResponse.class);
            res.setCharacterEncoding("UTF-8");
            res.addHeader("Content-Type", contentType);
            res.getWriter().print(jsonData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Unique row id generator
    public static String getId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

}
