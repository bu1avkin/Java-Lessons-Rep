package com.datatypes.idea.less13;

import java.sql.*;
import java.util.Scanner;

public class DeleteById extends Exercise13 {
    public void delete() throws SQLException {
        Scanner sc = new Scanner(System.in);
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/testy", "root", "root1234");
        System.out.print("Введите id строки, которую хотите удалить: ");
        int a = sc.nextInt();
        String query = "delete from " + table_name + " where i = ?";
        PreparedStatement statement1 = connection.prepareStatement(query);
        statement1.setInt(1, a);
        statement1.executeUpdate();
    }

}
