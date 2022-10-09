package com.datatypes.idea.less1.baselvl;

import java.util.Scanner;

public class floatType {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.println("Число1: ");
        float a = text.nextFloat();


        Scanner text2 = new Scanner(System.in);
        System.out.println("Число2: ");
        float b = text2.nextFloat();

        float x =  a + b ;
        System.out.println("Сумма: " +x);
        float x1 = (a - b );
        System.out.println("Разность: " +x1);
        float x2 =  (a * b );
        System.out.println("Умножение: " +x2);
        float x3 =  (a / b );
        System.out.println("Деление: " +x3);
        float x4 =  (a % b);
        System.out.println("Остаток: " +x4);
        float x5 =  (Math.abs(a));
        System.out.println("Модуль: " +x5);
        float x6 = (float) Math.pow(a, 2);
        System.out.println("Степень: " +x6);

    }
}
