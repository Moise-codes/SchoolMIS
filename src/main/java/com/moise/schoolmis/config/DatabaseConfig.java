package com.moise.schoolmis.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    public static Connection getConnection() throws SQLException  {
        Connection postgres = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/schoolmis",
                "postgres",
                "moise@123"
        );
        return postgres;

    }
}
