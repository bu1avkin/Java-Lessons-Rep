package com.datatypes.idea.less1.baselvl;

import java.util.Scanner;

public class intType {
    public static void main(String[] args) {

        // принимаем ввод первого числа
        Scanner text = new Scanner(System.in);
        System.out.println("Число1: ");
        int a = text.nextInt();

        // принимаем ввод второго числа
        Scanner text2 = new Scanner(System.in);
        System.out.println("Число2: ");
        int b = text2.nextInt();

        // сложение
        int g =  a + b ;
        System.out.println("Сумма: " +g);

        // вычитание
        int g1 = (a - b );
        System.out.println("Разность: " +g1);

        // произведение
        int g2 =  (a * b );
        System.out.println("Умножение: " +g2);

        // частное
        int g3 =  (a / b );
        System.out.println("Деление: " +g3);

        // частное (остаток)
        int g4 =  (a % b);
        System.out.println("Остаток: " +g4);

        // модуль
        int g5 =  (Math.abs(a));
        System.out.println("Модуль: " +g5);

        // степень
        int g6 = (int) Math.pow(a, 2);
        System.out.println("Степень: " +g6);
    }
}
