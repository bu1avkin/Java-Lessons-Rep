package com.datatypes.idea.less13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.io.*;


public class CSV extends Exercise13 {
    public void csv() throws ClassNotFoundException, SQLException, IOException {
        try {

            PrintWriter pw = new PrintWriter(new File("/Users/bulavkin/Developer/GitHub/Java-Lessons-Rep/javaLessons/src/com/datatypes/idea/csv_files/test.csv"));
            pw.println("list1,list2");
            StringBuilder sb = new StringBuilder();


            Connection connection = null;
            db_connection obj_sb_connection = new db_connection();
            connection = obj_sb_connection.getConnection();
            ResultSet rs = null;

            String query = "select * from testy.testy_csv";
            PreparedStatement ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                sb.append(rs.getString("list1"));
                sb.append(",");
                sb.append(rs.getString("list2"));
                sb.append("\r\n");
            }

            pw.write(sb.toString());
            pw.close();
            System.out.println("finished");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

