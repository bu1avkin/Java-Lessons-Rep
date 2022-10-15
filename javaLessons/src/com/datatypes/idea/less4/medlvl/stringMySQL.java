package com.datatypes.idea.less4.medlvl;

import java.sql.*;
import java.util.Scanner;
import java.util.Arrays;

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

        while (!"6".equals(s)) {
            System.out.println("1. Вывести все таблицы из базы данных.");
            System.out.println("2. Создать таблицу в базе данных.");
            System.out.println("3. Возвращение подстроки по индексам, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("4. Подсчитать размер ранее введенных строк, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("5. Поиск подстроки и определение окончания подстроки, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("6. Выход из программы.");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода.");
            }

            switch (x) {
                case 1 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less2medlvl";
                    Connection con = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");
                    Statement stmt = con.createStatement();
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

                    String sub1 = str1.substring(2);
                    String sub2 = str2.substring(2);

                    String query2 = "INSERT INTO " + tablename + " (STR1, STR2) VALUES (?, ?)";
                    PreparedStatement stmt3 = con3.prepareStatement(query2);
                    stmt3.setString(1, sub1);
                    stmt3.setString(2, sub2);
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

                    String str1_up = str1.toUpperCase();
                    String str2_up = str2.toUpperCase();

                    String query4 = "INSERT INTO " + tablename + " (STR1, STR2) VALUES (?, ?)";
                    PreparedStatement stmt4 = con4.prepareStatement(query4);
                    stmt4.setString(1, str1_up);
                    stmt4.setString(2, str2_up);
                    stmt4.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");
                    ResultSet rs4 = stmt4.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs4.next()) {
                        System.out.print(Arrays.toString(rs4.getString(1).split("  ")));
                        System.out.print(Arrays.toString(rs4.getString(2).split("  ")));
                        System.out.println();
                    }

                    String str1_down = str1.toLowerCase();
                    String str2_down = str1.toLowerCase();

                    String query42 = "INSERT INTO " + tablename + " (STR1, STR2) VALUES (?, ?)";
                    PreparedStatement stmt42 = con4.prepareStatement(query42);
                    stmt42.setString(1, str1_down);
                    stmt42.setString(2, str2_down);
                    stmt42.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");
                    ResultSet rs42 = stmt42.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs42.next()) {
                        System.out.print(Arrays.toString(rs42.getString(1).split("  ")));
                        System.out.print(Arrays.toString(rs42.getString(2).split("  ")));
                        System.out.println();
                    }
                }
                case 5 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less2medlvl";
                    Connection con5 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    Scanner text3 = new Scanner(System.in);
                    System.out.println("Введите подстроку: ");
                    String str3 = text3.nextLine();

                    boolean bool;

                    bool = str1.endsWith(str3);

                    String query5 = "INSERT INTO " + tablename + " (STR1, STR2) VALUES (?, ?)";
                    PreparedStatement stmt5 = con5.prepareStatement(query5);
                    stmt5.setString(1, str3);
                    stmt5.setBoolean(2, bool);
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
            }
        }
    }
}
