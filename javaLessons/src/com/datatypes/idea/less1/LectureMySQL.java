package com.datatypes.idea.less1;

import java.sql.*;
import java.util.Scanner;
import java.util.Arrays;

/*
Средний вариант.
    Реализовать программу с итерактивным консольным меню (т.е вывод списка действий по цифрам.
При этом при нажатии на цифру у нас доджно выполнятся определенное действие).
    Задачи полностью идентичны заданию 1.
    1. Вывести все таблици из текущей базы данных MySQL.
    2. Создать таблицу в MySQL, сохранение и вывод таблиц в обновленном виде из MySQL
    3. Добавить данные в таблицу MySQL.
    4. Выход из программы.

*/

public class LectureMySQL {
    public static void main(String[] args) throws SQLException {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s = "";
        System.out.println("Введите название таблицы: ");
        String tablename = scan.nextLine();

        while (!"4".equals(s)) {
            System.out.println("1. Вывести все таблицы из базы данных.");
            System.out.println("2. Создать таблицу в базе данных.");
            System.out.println("3. Добавить данный в таблицу.");
            System.out.println("4. Выход из программы.");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода.");
            }

            switch (x) {
                case 1 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/lecture7MySQL";
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
                    String mysqlUrl = "jdbc:mysql://localhost/lecture7MySQL";
                    Connection con1 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");
                    Statement stmt1 = con1.createStatement();
                    String query = "CREATE TABLE IF NOT EXISTS " + tablename + " (ID int, TEST varchar(255))";
                    stmt1.executeUpdate(query);
                    ResultSet rs1 = stmt1.executeQuery("SHOW TABLES");
                    System.out.println("Таблицы из базы данных: ");
                    while (rs1.next()) {
                        System.out.print(rs1.getString(1));
                        System.out.println();
                    }
                }
                case 3 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/lecture7MySQL";
                    Connection con2 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    System.out.println("Введите ID #1: ");
                    int ID1 = scan.nextInt();
                    System.out.println("Введите ID #2: ");
                    int ID2 = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Введите строку #1: ");
                    String test1 = scan.nextLine();
                    System.out.println("Введите строку #2: ");
                    String test2 = scan.nextLine();

                    String query2 = "INSERT INTO " + tablename + " (ID, TEST) VALUES (?, ?), (?, ?)";
                    PreparedStatement stmt3 = con2.prepareStatement(query2);
                    stmt3.setInt(1, ID1);
                    stmt3.setString(2, test1);
                    stmt3.setInt(3, ID2);
                    stmt3.setString(4, test2);
                    stmt3.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");
                    ResultSet rs2 = stmt3.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs2.next()) {
                        System.out.print(Arrays.toString(rs2.getString((1)).split(" ")));
                        System.out.print(Arrays.toString(rs2.getString((2)).split(" ")));
                        System.out.println();
                    }
                }
            }
        }
    }
}
