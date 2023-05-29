package com.datatypes.idea.less13;

import java.sql.*;
import java.util.Scanner;

public class TableCreation extends Exercise13 {

    public void table_create() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/testy";
        Connection con2 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
        System.out.println("Коннект к базе - Успешно!");
        Statement stmt2 = con2.createStatement();
        String query = "CREATE TABLE IF NOT EXISTS " + table_name + " (list1 VARCHAR(50), list2 VARCHAR(50))";
        stmt2.executeUpdate(query);
        ResultSet rs2 = stmt2.executeQuery("SHOW TABLES");
        System.out.println("Таблицы из базы данных: ");
        while (rs2.next()) {
            System.out.print(rs2.getString(1));
            System.out.println();
        }
    }
}