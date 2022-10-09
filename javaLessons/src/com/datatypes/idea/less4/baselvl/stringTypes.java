package com.datatypes.idea.less4.baselvl;

import java.util.Scanner;

public class stringTypes {
    public static void main(String[] args) {

        // ввод первой строки
        Scanner text1 = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = text1.nextLine();

        // ввод второй строки
        Scanner text2 = new Scanner(System.in);
        System.out.print("Введите вторую строку: ");
        String str2 = text2.nextLine();

        // вывод
        System.out.println("Ваши строки: ");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("");

        // вывод по индексу
        System.out.println(str1.substring(2));

        // верхний
        String str1_up = str1.toUpperCase();
        System.out.println(str1_up);
        String str2_up = str2.toUpperCase();
        System.out.println(str2_up);

        // нижний
        String str1_down = str1.toLowerCase();
        System.out.println(str1_down);
        String str2_down = str2.toLowerCase();
        System.out.println(str2_down);

        // третья строка
        Scanner text3 = new Scanner(System.in);
        System.out.println("Введите подстроку: ");
        String str3 = text3.nextLine();

        boolean bool;

        bool = str1.endsWith(str3);
        System.out.println(str1 + " - строка заканчивается на: " + str3 + " - " + bool);
    }
}
