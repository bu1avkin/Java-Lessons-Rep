package com.datatypes.idea.less7.medlvl;

import com.datatypes.idea.less7.baselvl.Sort;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class SortSQL extends ArrayPII {
    public static int A;
    public static void main(String[] args) throws SQLException {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s = "";

        System.out.println("\nСколько элементов в массиве: ");
        String mas = scan.nextLine();

        A = Integer.parseInt(mas);

        System.out.println("\nВведите название таблицы: ");
        String tablename = scan.nextLine();


        while (!"5".equals(s)) {
            System.out.println("1. Вывести все таблицы из базы данных.");
            System.out.println("2. Создать таблицу в базе данных.");
            System.out.println("3. Ввести одномерный массив и сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("4. Отсортировать массив и сохранить в MySQL с последующим выводом в консоль.");
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
                    String query2 = "CREATE TABLE IF NOT EXISTS " + tablename + " (MAS VARCHAR(255))";
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

                    ArrayPII.get_add1();

                    System.out.println("Ваш массив: " + Arrays.toString(ArrayPII.element_1));

                    String query3 = "INSERT INTO " + tablename + " (MAS) VALUES (?)";
                    PreparedStatement stmt3 = con3.prepareStatement(query3);
                    stmt3.setString(1, Arrays.toString(Arrays.toString(ArrayPII.element_1).split("  ")));
                    stmt3.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");

                    ResultSet rs3 = stmt3.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs3.next()) {
                        System.out.print(Arrays.toString(rs3.getString((1)).split("  ")));
                        System.out.println();
                    }
                }
                case 4 -> {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String mysqlUrl = "jdbc:mysql://localhost/less1medlvl";
                    Connection con3 = DriverManager.getConnection(mysqlUrl, "root", "root1234");
                    System.out.println("Коннект к базе - Успешно!");

                    Sort sorted = new Sort();
                    sorted.get_add1();
                    sorted.sortirovka();

                    System.out.println("Ваш массив: " + Arrays.toString(Sort.massivee));

                    String query3 = "INSERT INTO " + tablename + " (MAS) VALUES (?)";
                    PreparedStatement stmt3 = con3.prepareStatement(query3);
                    stmt3.setString(1, Arrays.toString(Sort.massivee));
                    stmt3.executeUpdate();
                    System.out.println("Данные в MySQL успешно добавлены!");

                    ResultSet rs3 = stmt3.executeQuery("SELECT * FROM " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs3.next()) {
                        System.out.print(Arrays.toString(rs3.getString((1)).split(" ")));
                        System.out.println();
                    }
                }
            }
        }
    }
}