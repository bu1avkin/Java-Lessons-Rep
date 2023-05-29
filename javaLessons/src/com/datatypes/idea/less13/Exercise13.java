package com.datatypes.idea.less13;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Exercise13 {
    static String table_name;

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        String act = "";
        while (!act.equals("6")) {
            System.out.println("""
                 1. Вывести все таблицы из базы данных MySQL.
                 2. Создать таблицу в базе данных MySQL.
                 3. Ввести список и сохранить в MySQL.
                 4. Удалить элемент из списка в MySQL по ID.
                 5. Сохранить итоговые результаты из MySQL в Excel и вывести их в консоль.
                 6. Выход""");
            act = sc.nextLine();
            TablesOutput tables_output = new TablesOutput();
            TableCreation table_creation = new TableCreation();
            DataInput dataInput_ = new DataInput();
            DeleteById deleteById = new DeleteById();
            CSV CSV = new CSV();
            try {
                Integer.parseInt(act);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (Integer.parseInt(act)) {
                case 1 -> tables_output.tables_out();
                case 2 -> table_creation.table_create();
                case 3 -> dataInput_.insert_data();
                case 4 -> deleteById.delete();
                case 5 -> {
                    try {
                        CSV.csv();
                    } catch (ClassNotFoundException | IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
