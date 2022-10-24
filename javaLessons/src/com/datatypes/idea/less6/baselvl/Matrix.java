package com.datatypes.idea.less6.baselvl;

import java.util.Scanner;

abstract class ArrayPI {
    public int[][] table_1 = new int[7][7];
    public int[][] table_2 = new int[7][7];
    Scanner scan = new Scanner(System.in);

    public int[][] get_add1() {
        System.out.println("первая матрица");
        for (int i = 0; i < table_1.length; i++) {
            for (int j = 0; j < table_1[i].length; j++) {
                System.out.println("ведите элемент  [" + i + "][" + j + "]:");
                table_1[i][j] = scan.nextInt();
            }
        }
        return table_1;
    }

    public int[][] get_add2() {
        System.out.println("вторая матрица");
        for (int i = 0; i < table_2.length; i++) {
            for (int j = 0; j < table_2[i].length; j++) {
                System.out.println("ведите элемент  [" + i + "][" + j + "]:");
                table_2[i][j] = scan.nextInt();
            }
        }
        return table_2;
    }
}

public final class Matrix extends ArrayPI {
    private static int[][] tms = new int[7][7];

    public void umnozh() {
        for (int i = 0; i < 7; i++) {
            for (int u = 0; u < 7; u++) {
                for (int j = 0; j < 7; j++) {
                    tms[i][u] += table_1[i][j] * table_2[j][u];
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(tms[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix bigM = new Matrix();
        bigM.umnozh();
        bigM.get_add1();
        bigM.get_add2();
        bigM.umnozh();

    }
}