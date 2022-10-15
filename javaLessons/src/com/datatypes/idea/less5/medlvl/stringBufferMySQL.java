package com.datatypes.idea.less5.medlvl;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class stringBufferMySQL {
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

        while (!"5".equals(s)) {
            System.out.println("1. Вывести все таблицы из базы данных.");
            System.out.println("2. Создать таблицу в базе данных.");
            System.out.println("3. Изменить порядок символов строки на обратный, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("4. Добавить одну строку в другую, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("5. Выход из программы.");
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

                    StringBuilder sb1 = new StringBuilder(str1);
                    StringBuilder sb2 = new StringBuilder(str2);

                    String query2 = "INSERT INTO " + tablename + " (STR1, STR2) VALUES (?, ?)";
                    PreparedStatement stmt3 = con3.prepareStatement(query2);
                    stmt3.setString(1, String.valueOf(sb1.reverse()));
                    stmt3.setString(2, String.valueOf(sb2.reverse()));
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

                    StringBuilder sb3 = new StringBuilder(str1);
                    String space = "";


                    String query4 = "INSERT INTO " + tablename + " (STR1, STR2) VALUES (?, ?)";
                    PreparedStatement stmt4 = con4.prepareStatement(query4);
                    stmt4.setString(1, String.valueOf(sb3.insert(2, str2)));
                    stmt4.setString(2, space);
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
            }
        }
    }
}
