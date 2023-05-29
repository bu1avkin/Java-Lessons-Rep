package com.datatypes.idea.less7.medlvl;

import java.util.Scanner;

public class ArrayPII {
    public static int[] element_1 = new int[35];
    Scanner scan = new Scanner(System.in);

    public static int[] get_add1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("заполняем матрицу: ");
        for (int i = 0; i < element_1.length; i++) {
            System.out.println("ведите элемент  [" + i + "]: ");
            element_1[i] = scan.nextInt();
        }
        return element_1;
    }
}
