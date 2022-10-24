package com.datatypes.idea.less3.baselvl;

import java.util.Scanner;

public class intType {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int skolko = scan.nextInt();
        for (int i = 0; i < skolko; i++) {
            System.out.println("Введите число:");
            float ch = scan.nextFloat();
            if (ch % 2 == 0) {
                System.out.println("оно чётное");
            } else {
                System.out.println("оно нечётное");
            }
            if (ch % 1 == 0) {
                System.out.println("оно целое");
            } else {
                System.out.println("оно нецелое");
            }
        }
    }
}
