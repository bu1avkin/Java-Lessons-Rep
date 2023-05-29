package com.datatypes.idea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class export_to_csv {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new File("/Users/bulavkin/Developer/GitHub/Java-Lessons-Rep/javaLessons/src/com/datatypes/idea/csv_files/test.csv"));
            pw.println("STR1,STR2");
            StringBuilder sb = new StringBuilder();


            Connection connection = null;
            db_connection obj_sb_connection = new db_connection();
            connection = obj_sb_connection.getConnection();
            ResultSet rs = null;

            String query = "select * from testy.testy_csv";
            PreparedStatement ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                sb.append(rs.getString("STR1"));
                sb.append(",");
                sb.append(rs.getString("STR2"));
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
