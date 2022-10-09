package com.datatypes.idea.less5.baselvl;

import java.util.Scanner;

public class StringBuffer {
    public StringBuffer(String str1, String str2) {
    }

    public static void main(String[] args) {

        Scanner text1 = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = text1.nextLine();

        Scanner text2 = new Scanner(System.in);
        System.out.print("Введите вторую строку: ");
        String str2 = text2.nextLine();

        System.out.println(str1);
        System.out.println(str2);

        StringBuilder sb = new StringBuilder(str1);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder(str2);
        sb2.reverse();
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder(str1);
        sb3.insert(2, str2);
        System.out.println(sb3);
    }
}
