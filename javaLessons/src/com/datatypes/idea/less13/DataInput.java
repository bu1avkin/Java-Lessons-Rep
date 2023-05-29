package com.datatypes.idea.less13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataInput extends Exercise13 {
    Listik listik = new Listik();
    public void insert_data() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/testy", "root", "root1234");
        String maths_query = "insert into " + table_name +
                "(list1, list2) values (?, ?)";
        PreparedStatement statement = connection.prepareStatement(maths_query);
        statement.setString(1, listik.random().toString());
        statement.setString(2, listik.input().toString());
        statement.executeUpdate();
    }
}
