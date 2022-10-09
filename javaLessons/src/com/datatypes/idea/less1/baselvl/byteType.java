package com.datatypes.idea.less1.baselvl;

import java.util.Scanner;

public class byteType {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.println("Число1: ");
        byte a = text.nextByte();


        Scanner text2 = new Scanner(System.in);
        System.out.println("Число2: ");
        byte b = text2.nextByte();

        byte x = (byte) (a + b );
        System.out.println("Сумма: " + x);
        byte x1 = (byte) (a - b );
        System.out.println("Разность: " + x1);
        byte x2 = (byte) (a * b );
        System.out.println("Умножение: " + x2);
        byte x3 = (byte) (a / b );
        System.out.println("Деление: " + x3);
        byte x4 = (byte) (a % b);
        System.out.println("Остаток: " + x4);
        byte x5 = (byte) (Math.abs(a));
        System.out.println("Модуль: " + x5);
        byte x6 = (byte) (Math.pow(a, 2));
        System.out.println("Степень: " + x6);

    }
}
