package com.patterns.demo.models.Database.Interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDB {
    Connection getConnection() throws SQLException, ClassNotFoundException;

    void close();
}
