package com.clickstream.data.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
public class JdbcConfig {

    //Database details are passed into this config using environment variables
    @Value("${DB_JDBC_URL}")
    private String dbJdbcUrl;

    @Value("${DB_USER}")
    private String dbUser;

    @Value("${DB_PASSWORD}")
    private String dbPassword;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.sqlite.JDBC");

        //Intentionally leaving commenting code here for future reference
        //dataSource.setUrl("jdbc:sqlite:memory:myDb?cache=shared");
        //dataSource.setUrl("jdbc:sqlite:C:\\Users\\vijay\\projects\\data\\mydata.db");

        dataSource.setUrl(dbJdbcUrl);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }
}


