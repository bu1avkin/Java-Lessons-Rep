package com.datatypes.idea.less11.baselvl;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну катета А: ");
        int a = scan.nextInt();
        int b = a;
        System.out.println("Введите длинну гипотинузы С: ");
        int c = scan.nextInt();
    }

    public static void perimtr(int a,int b,int c) {
        int perimetr = a + b + c;
        System.out.println("Периметр равен: " + perimetr);
    }

    public static void squere(int a,int b,int c) {
        int sq = (a + b + c) / 2;
        double sqr = Math.sqrt(sq * (sq - a) * (sq - b) * (sq - c));
        System.out.println("Площадь равна: " + sq);
    }
}
