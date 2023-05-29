package com.datatypes.idea.less2.medlvl;

import java.sql.*;
import java.util.Scanner;
import java.util.Arrays;
import com.datatypes.idea.db_connection;

public class stringMySQL {
    public static void main(String[] args) throws SQLException {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s = "";
        System.out.println("Введите название таблицы: ");
        String tablename = scan.nextLine();

        Scanner text1 = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = text1.nextLine();

        Scanner text2 = new Scanner(System.in);
        System.out.println("Введите вторую строку: ");
        String str2 = text2.nextLine();

        while (!"7".equals(s)) {
            System.out.println("1. Вывести все таблицы из базы данных.");
            System.out.println("2. Создать таблицу в базе данных.");
            System.out.println("3. Ввести две строки с клавиатуры, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("4. Подсчитать размер ранее введенных строк, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("5. Объединить две строки в единое целое, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("6. Сравнить две ранее введенные строки, результат сохранить в MySQL с последующим выводом в консоль");
            System.out.println("7. Выход из программы.");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода.");
            }

            switch (x) {
                case 1 -> {
                    Connection connection = null;
                    db_connection obj_sb_connection = new db_connection();
                    connection = obj_sb_connection.getConnection();
                    System.out.println("Коннект к базе - Успешно!");
                    Statement stmt = connection.createStatement();
                    ResultSet rs = stmt.executeQuery("SHOW TABLES");
                    System.out.println("Таблицы из базы данных: ");
                    while (rs.next()) {
                        System.out.print(rs.getString(1));
                        System.out.println();
                    }
                }
                case 2 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less2medlvl";
                    Connection con2 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");
                    Statement stmt2 = con2.createStatement();
                    String query = "CREATE TABLE IF NOT EXISTS " + tablename + " (STR1 VARCHAR(50), STR2 VARCHAR(50))";
                    stmt2.executeUpdate(query);
                    ResultSet rs2 = stmt2.executeQuery("SHOW TABLES");
                    System.out.println("Таблицы из базы данных: ");
                    while (rs2.next()) {
                        System.out.print(rs2.getString(1));
                        System.out.println();
                    }
                }
                case 3 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less2medlvl";
                    Connection con3 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    String query2 = "INSERT INTO " + tablename + " (STR1, STR2) VALUES (?, ?)";
                    PreparedStatement stmt3 = con3.prepareStatement(query2);
                    stmt3.setString(1, str1);
                    stmt3.setString(2, str2);
                    stmt3.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");
                    ResultSet rs3 = stmt3.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs3.next()) {
                        System.out.print(Arrays.toString(rs3.getString(1).split("  ")));
                        System.out.print(Arrays.toString(rs3.getString(2).split("  ")));
                        System.out.println();
                    }
                }
                case 4 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less2medlvl";
                    Connection con4 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    int leng1 = str1.length();
                    int leng2 = str2.length();

                    String query4 = "INSERT INTO " + tablename + " (STR1, STR2) VALUES (?, ?)";
                    PreparedStatement stmt4 = con4.prepareStatement(query4);
                    stmt4.setInt(1, leng1);
                    stmt4.setInt(2, leng2);
                    stmt4.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");
                    ResultSet rs4 = stmt4.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs4.next()) {
                        System.out.print(Arrays.toString(rs4.getString(1).split("  ")));
                        System.out.print(Arrays.toString(rs4.getString(2).split("  ")));
                        System.out.println();
                    }
                }
                case 5 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less2medlvl";
                    Connection con5 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    String together = str1 + str2;
                    int leng3 = together.length();

                    String query5 = "INSERT INTO " + tablename + " (STR1, STR2) VALUES (?, ?)";
                    PreparedStatement stmt5 = con5.prepareStatement(query5);
                    stmt5.setString(1, together);
                    stmt5.setInt(2, leng3);
                    stmt5.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");
                    ResultSet rs5 = stmt5.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs5.next()) {
                        System.out.print(Arrays.toString(rs5.getString(1).split("  ")));
                        System.out.print(Arrays.toString(rs5.getString(2).split("  ")));
                        System.out.println();
                    }
                }
                case 6 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less2medlvl";
                    Connection con6 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    Boolean EQ = str1.equals(str2);

                    String query6 = "INSERT INTO " + tablename + " (STR1, STR2) VALUES (?, ?)";
                    PreparedStatement stmt6 = con6.prepareStatement(query6);
                    stmt6.setBoolean(1, EQ);
                    stmt6.setBoolean(2, EQ);
                    stmt6.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");
                    ResultSet rs6 = stmt6.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs6.next()) {
                        System.out.print(Arrays.toString(rs6.getString(1).split("  ")));
                        System.out.print(Arrays.toString(rs6.getString(2).split("  ")));
                        System.out.println();
                    }
                }
            }
        }
    }
}
