package com.datatypes.idea.less7.baselvl;

import com.datatypes.idea.less7.medlvl.SortSQL;

import java.util.Arrays;
import java.util.Scanner;

abstract class ArrayPII {
    public int[] element_1 = new int[SortSQL.A];
    Scanner scan = new Scanner(System.in);

    public int[] get_add1() {
        System.out.println("заполняем матрицу: ");
        for (int i = 0; i < element_1.length; i++) {
            System.out.println(element_1.length);
            System.out.println("ведите элемент  [" + i + "]: ");
            element_1[i] = scan.nextInt();
        }
        return element_1;
    }
}

public final class Sort extends ArrayPII {
    public static int[] massivee = new int[SortSQL.A];
    public void sortirovka() {
        boolean ArraySorted = false;
        int test1;
        while (!ArraySorted) {
            ArraySorted = true;
            for (int i = 0; i < element_1.length - 1; i++) {
                if (element_1[i] > element_1[i + 1]) {
                    ArraySorted = false;
                    test1 = element_1[i];
                    element_1[i] = element_1[i + 1];
                    element_1[i + 1] = test1;
                }
            }
        }
        massivee = element_1;
        System.out.println("отсортированный массив: " + Arrays.toString(element_1));
    }

    public static void main(String[] args) {
        Sort miniS = new Sort();
        miniS.get_add1();
        miniS.sortirovka();

    }
}