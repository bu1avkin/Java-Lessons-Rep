package com.datatypes.idea.less9;

import java.util.Scanner;

abstract class AarrayPI {
    public int[][] mas1 = new int[4][4];
    public int[][] mas2 = new int[4][4];
    Scanner scan = new Scanner(System.in);

    public int[][] get_add1() {
        System.out.println("первая матрица");
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                System.out.println("ведите элемент  [" + i + "][" + j + "]:");
                mas1[i][j] = scan.nextInt();
            }
        }
        return mas1;
    }

    public int[][] get_add2() {
        System.out.println("вторая матрица");
        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                System.out.println("ведите элемент  [" + i + "][" + j + "]:");
                mas2[i][j] = scan.nextInt();
            }
        }
        return mas2;
    }
}

public final class minus extends AarrayPI {
    private static int[][] mas3 = new int[4][4];

    public int[][] min() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mas3[i][j] = mas1[i][j] - mas2[i][j];

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mas3[i][j] + "\t");
            }
            System.out.println();
        }
        return mas3;
    }

    public static void main(String[] args) {
        minus vv = new minus();
        vv.get_add1();
        vv.get_add2();
        vv.min();
    }
}

