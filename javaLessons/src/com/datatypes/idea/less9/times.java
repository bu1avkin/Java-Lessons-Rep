package com.datatypes.idea.less9;

public final class times extends AarrayPI {
    private static int[][] tm = new int[4][4];

    public int[][] times() {
        for (int i = 0; i < 4; i++) {
            for (int u = 0; u < 4; u++) {
                for (int j = 0; j < 4; j++) {
                    tm[i][u] += mas1[i][j] * mas2[j][u];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tm[i][j] + "\t");
            }
            System.out.println();
        }
        return tm;
    }

    public static void main(String[] args) {
        times vv = new times();
        vv.get_add1();
        vv.get_add2();
        vv.times();
    }
}
