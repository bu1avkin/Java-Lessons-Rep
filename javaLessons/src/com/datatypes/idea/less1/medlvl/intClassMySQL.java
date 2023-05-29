package com.datatypes.idea.less1.medlvl;

import java.sql.*;
import java.util.Scanner;
import java.util.Arrays;

/*
Средний вариант.
 Целочисленные, байтовые и вещественные типы данных. Реализовать программу с интерактивным консольным меню,
 (т.е. вывод списка действий по цифрам. При этом при нажатии на цифру у нас должно выполняться определенное действие).
 Задания полностью идентичны заданию No1 базовому варианту. При этом в программе данные пункты должны называться
 следующим образом:
 1. Вывести все таблицы из MySQL.
 2. Создать таблицу в MySQL.
 3. Сложение чисел, результат сохранить в MySQL с последующим выводом в консоль.
 4. Вычитание чисел, результат сохранить в MySQL с последующим выводом в консоль.
 5. Умножение чисел, результат сохранить в MySQL с последующим выводом в консоль.
 6. Деление чисел, результат сохранить в MySQL с последующим выводом в консоль.
 7. Деление чисел по модулю (остаток), результат сохранить в MySQL с последующим выводом в консоль.
 8. Возведение числа в модуль, результат сохранить в MySQL с последующим выводом в консоль.
*/

public class intClassMySQL {
    public static void main(String[] args) throws SQLException {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s = "";

        System.out.println("\nВведите название таблицы: ");
        String tablename = scan.nextLine();


        while (!"9".equals(s)) {
            System.out.println("1. Вывести все таблицы из базы данных.");
            System.out.println("2. Создать таблицу в базе данных.");
            System.out.println("3. Сложение чисел, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("4. Вычитание чисел, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("5. Умножение чисел, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("6. Деление чисел, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("7. Деление чисел по модулю (остаток), результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("8. Возведение числа в модуль, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("9. Выход из программы.");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода.");
            }

            switch (x) {
                case 1 -> {

                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less1medlvl";
                    Connection con1 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    Statement stmt1 = con1.createStatement();
                    ResultSet rs1 = stmt1.executeQuery("SHOW TABLES");
                    System.out.println("Таблицы из базы данных: ");
                    while (rs1.next()) {
                        System.out.print(rs1.getString(1));
                        System.out.println();

                    }
                }
                case 2 -> {

                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less1medlvl";
                    Connection con2 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    Statement stmt2 = con2.createStatement();
                    String query2 = "CREATE TABLE IF NOT EXISTS " + tablename + " (NUM1 int, NUM2 int, NUM3 int)";
                    stmt2.executeUpdate(query2);

                    ResultSet rs2 = stmt2.executeQuery("SHOW TABLES");

                    System.out.println("Таблицы из базы данных: ");
                    while (rs2.next()) {
                        System.out.print(rs2.getString(1));
                        System.out.println();
                    }
                }
                case 3 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less1medlvl";
                    Connection con3 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    System.out.println("Введите ID #1: ");
                    int NUM1 = scan.nextInt();
                    System.out.println("Введите ID #2: ");
                    int NUM2 = scan.nextInt();
                    scan.nextLine();

                    int SUM3 = NUM1 + NUM2;

                    String query3 = "INSERT INTO " + tablename + " (NUM1, NUM2, NUM3) VALUES (?, ?, ?)";
                    PreparedStatement stmt3 = con3.prepareStatement(query3);
                    stmt3.setInt(1, NUM1);
                    stmt3.setInt(2, NUM2);
                    stmt3.setInt(3, SUM3);
                    stmt3.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");

                    ResultSet rs3 = stmt3.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs3.next()) {
                        System.out.print(Arrays.toString(rs3.getString((1)).split(" ")));
                        System.out.print(Arrays.toString(rs3.getString((2)).split(" ")));
                        System.out.print(Arrays.toString(rs3.getString((3)).split(" ")));
                        System.out.println();
                    }
                }
                case 4 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less1medlvl";
                    Connection con4 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    System.out.println("Введите ID #1: ");
                    int NUM1 = scan.nextInt();
                    System.out.println("Введите ID #2: ");
                    int NUM2 = scan.nextInt();
                    scan.nextLine();

                    int SUB3 = NUM1 - NUM2;

                    String query4 = "INSERT INTO " + tablename + " (NUM1, NUM2, NUM3) VALUES (?, ?, ?)";
                    PreparedStatement stmt4 = con4.prepareStatement(query4);
                    stmt4.setInt(1, NUM1);
                    stmt4.setInt(2, NUM2);
                    stmt4.setInt(3, SUB3);
                    stmt4.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");

                    ResultSet rs4 = stmt4.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs4.next()) {
                        System.out.print(Arrays.toString(rs4.getString((1)).split(" ")));
                        System.out.print(Arrays.toString(rs4.getString((2)).split(" ")));
                        System.out.print(Arrays.toString(rs4.getString((3)).split(" ")));
                        System.out.println();
                    }
                }
                case 5 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less1medlvl";
                    Connection con5 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    System.out.println("Введите ID #1: ");
                    int NUM1 = scan.nextInt();
                    System.out.println("Введите ID #2: ");
                    int NUM2 = scan.nextInt();
                    scan.nextLine();

                    int MULT3 = NUM1 * NUM2;

                    String query5 = "INSERT INTO " + tablename + " (NUM1, NUM2, NUM3) VALUES (?, ?, ?)";
                    PreparedStatement stmt5 = con5.prepareStatement(query5);
                    stmt5.setInt(1, NUM1);
                    stmt5.setInt(2, NUM2);
                    stmt5.setInt(3, MULT3);
                    stmt5.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");

                    ResultSet rs5 = stmt5.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs5.next()) {
                        System.out.print(Arrays.toString(rs5.getString((1)).split(" ")));
                        System.out.print(Arrays.toString(rs5.getString((2)).split(" ")));
                        System.out.print(Arrays.toString(rs5.getString((3)).split(" ")));
                        System.out.println();
                    }
                }
                case 6 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less1medlvl";
                    Connection con6 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    System.out.println("Введите ID #1: ");
                    int NUM1 = scan.nextInt();
                    System.out.println("Введите ID #2: ");
                    int NUM2 = scan.nextInt();
                    scan.nextLine();

                    int DIV3 = NUM1 / NUM2;

                    String query6 = "INSERT INTO " + tablename + " (NUM1, NUM2, NUM3) VALUES (?, ?, ?)";
                    PreparedStatement stmt6 = con6.prepareStatement(query6);
                    stmt6.setInt(1, NUM1);
                    stmt6.setInt(2, NUM2);
                    stmt6.setInt(3, DIV3);
                    stmt6.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");

                    ResultSet rs6 = stmt6.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs6.next()) {
                        System.out.print(Arrays.toString(rs6.getString((1)).split(" ")));
                        System.out.print(Arrays.toString(rs6.getString((2)).split(" ")));
                        System.out.print(Arrays.toString(rs6.getString((3)).split(" ")));
                        System.out.println();
                    }
                }
                case 7 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less1medlvl";
                    Connection con7 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    System.out.println("Введите ID #1: ");
                    int NUM1 = scan.nextInt();
                    System.out.println("Введите ID #2: ");
                    int NUM2 = scan.nextInt();
                    scan.nextLine();

                    int REST3 = NUM1 % NUM2;

                    String query7 = "INSERT INTO " + tablename + " (NUM1, NUM2, NUM3) VALUES (?, ?, ?)";
                    PreparedStatement stmt7 = con7.prepareStatement(query7);
                    stmt7.setInt(1, NUM1);
                    stmt7.setInt(2, NUM2);
                    stmt7.setInt(3, REST3);
                    stmt7.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");

                    ResultSet rs7 = stmt7.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs7.next()) {
                        System.out.print(Arrays.toString(rs7.getString((1)).split(" ")));
                        System.out.print(Arrays.toString(rs7.getString((2)).split(" ")));
                        System.out.print(Arrays.toString(rs7.getString((3)).split(" ")));
                        System.out.println();
                    }
                }
                case 8 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less1medlvl";
                    Connection con8 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    System.out.println("Введите ID #1: ");
                    int NUM1 = scan.nextInt();
                    System.out.println("Введите ID #2: ");
                    int NUM2 = scan.nextInt();
                    scan.nextLine();

                    int POW3 = (int) Math.pow(NUM1, NUM2);

                    String query8 = "INSERT INTO " + tablename + " (NUM1, NUM2, NUM3) VALUES (?, ?, ?)";
                    PreparedStatement stmt8 = con8.prepareStatement(query8);
                    stmt8.setInt(1, NUM1);
                    stmt8.setInt(2, NUM2);
                    stmt8.setInt(3, POW3);
                    stmt8.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");

                    ResultSet rs8 = stmt8.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs8.next()) {
                        System.out.print(Arrays.toString(rs8.getString((1)).split(" ")));
                        System.out.print(Arrays.toString(rs8.getString((2)).split(" ")));
                        System.out.print(Arrays.toString(rs8.getString((3)).split(" ")));
                        System.out.println();
                    }
                }
            }
        }
    }
}
