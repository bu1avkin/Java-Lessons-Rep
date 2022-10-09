package com.datatypes.idea.less1;

public class dataTypes {
    public static void main(String[] args) {

        byte a = 0;
        byte b = 127;
        byte c = 5;

        System.out.println("Байтовое значение a = " + a);
        System.out.println("Байтовое значение b = " + b);
        System.out.println("Байтовое значение c = " + c);

        byte x = (byte) (a+b+c); // сумма
        byte x1 = (byte) (a-b-c); // разность
        byte x2 = (byte) (a*b*c); // произведение
        byte x3 = (byte) (a / c); // частное
        byte x4 = (byte) (a % c); // частное (деление по модулю / остаток)
        byte x5 = (byte) (Math.abs(a)); // модуль числа
        byte x6 = (byte) (Math.pow(a, 2));   // степень
        System.out.println(a==b); // сравнение

        // смена знака
        int n = 90;
        n = -n;
        System.out.println(n); // вывод -90
        n = -n;
        System.out.println(n); // вывод 90

        // увеличить или уменьшить число на 1
        n++;
        System.out.println(n); // прибавили 1, вывод 91
        n--;
        System.out.println(n); // вычли 1, вывод 90

    }
}
