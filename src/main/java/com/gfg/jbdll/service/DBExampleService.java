package com.gfg.jbdll.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBExampleService {



    @Autowired
    Connection connection;

    PreparedStatement getAllMovieStatement = null;

    PreparedStatement addMovieStatement =null;

    @PostConstruct
    public void createTable() throws SQLException {
        String query = "create table if not exists movie (id INT auto_increment primary key "
    }

    try(Statement statement = connection.createStatement()) {

    }catch (Exception ex){
        logger.error("error creating table");
    }

    try {
        addMovieStatement=
    }
}
