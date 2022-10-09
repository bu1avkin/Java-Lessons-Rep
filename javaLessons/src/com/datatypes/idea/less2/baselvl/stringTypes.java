package com.datatypes.idea.less2.baselvl;

import java.util.Scanner;

public class stringTypes {
    public static void main(String[] args) {

        Scanner text1 = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = text1.nextLine();

        Scanner text2 = new Scanner(System.in);
        System.out.println("Введите вторую строку: ");
        String str2 = text2.nextLine();

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("\nДлинна первой строки: " + str1.length());
        System.out.println("Длинна второй строки: " + str2.length());

        System.out.println("\nCтроки вместе: " + str1+str2);

        if (str1.equals(str2)) {
            System.out.println("\nСтроки равны");
        }
        else {
            System.out.println("\nСтроки не равны");
        }
    }
}