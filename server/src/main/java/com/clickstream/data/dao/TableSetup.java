package com.clickstream.data.dao;

import org.openapitools.model.EventRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

//Purpose of this class is to create tables if they are not existing in database
@Service
public class TableSetup {

    private DataSource dataSource;

    //Datasource bean is injected
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public TableSetup(DataSource dataSource) {
        this.dataSource = dataSource;
        this.createTableIfNotExist();
    }

    Logger logger = LoggerFactory.getLogger(TableSetup.class);

    final String sqlCreateEventTable = "CREATE TABLE IF NOT EXISTS event(id VARCHAR(100) PRIMARY KEY, client_id VARCHAR(100), " +
            "type VARCHAR(100), pointer VARCHAR(100), " +
            "page_url VARCHAR(100), element_class VARCHAR(100), " +
            "element_id VARCHAR(100), element_name VARCHAR(100), element_text VARCHAR(100), created_date VARCHAR(100));";

    final String sqlCreateEventIndex1 = "CREATE INDEX IF NOT EXISTS idx_created_date ON event (created_date);";
    final String sqlCreateEventIndex2 = "CREATE INDEX IF NOT EXISTS idx_client_id ON event (client_id);";

    public void createTableIfNotExist() {
        logger.info("## createTableIfNotExist inside DAO");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute(sqlCreateEventTable);
        jdbcTemplate.execute(sqlCreateEventIndex1);
        jdbcTemplate.execute(sqlCreateEventIndex2);
    }
}
