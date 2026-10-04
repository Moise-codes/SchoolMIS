package com.moise.schoolmis;
import com.moise.schoolmis.config.DatabaseConfig;
import java.sql.Connection;

public class SchoolMisApplication {
    public static void main(String[] args) {
        try {
            Connection connection =  DatabaseConfig.getConnection();
            System.out.println("Database Connection Successful!");
            connection.close();


        } catch (Exception e){
            System.out.println("Database Connection Failed!");
            e.printStackTrace();

        }
    }
}