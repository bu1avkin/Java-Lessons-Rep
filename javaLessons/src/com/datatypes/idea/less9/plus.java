package com.datatypes.idea.less9;

public final class plus extends AarrayPI {
    private static int[][] mas4 = new int[4][4];

    public int[][] pl() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mas4[i][j] = mas1[i][j] + mas2[i][j];

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mas4[i][j] + "\t");
            }
            System.out.println();
        }
        return mas4;
    }

    public static void main(String[] args) {
        plus vv = new plus();
        vv.get_add1();
        vv.get_add2();
        vv.pl();
    }
}
