package com.datatypes.idea.less13;

import java.sql.*;

public class TablesOutput extends Exercise13 {
    public void tables_out() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/less2medlvl";
        Connection connection = DriverManager.getConnection(mysqlUrl, "root", "root1234");
        Statement stmt2 = connection.createStatement();
        ResultSet rs2 = stmt2.executeQuery("SHOW TABLES");
        System.out.println("Таблицы из базы данных: ");
        while (rs2.next()) {
            System.out.print(rs2.getString(1));
            System.out.println();
        }
        System.out.println();
    }
}

// 6 основных модификаторов класса
// 1. public - класс доступен из любого места
// 2. private - класс доступен только внутри класса
// 3. protected - класс доступен внутри класса и внутри пакета
// 4. default - класс доступен внутри пакета
// 5. abstract - класс не может быть создан, но может быть унаследован
// 6. final - класс не может быть унаследован

// Модификаторы доступа
// 1. public - доступен из любого места
// 2. private - доступен только внутри класса
// 3. protected - доступен внутри класса и внутри пакета
// 4. default - доступен внутри пакета

// Модификаторы класса
// 1. abstract - класс не может быть создан, но может быть унаследован
// 2. final - класс не может быть унаследован



