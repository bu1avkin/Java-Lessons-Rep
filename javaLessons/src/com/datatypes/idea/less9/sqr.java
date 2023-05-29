package com.datatypes.idea.less9;

public final class sqr extends AarrayPI {
    private static int[][] mas5 = new int[4][4];

    public void sq() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mas5[i][j] += Math.pow(mas1[i][j], mas2[i][j]);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mas5[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        sqr vv = new sqr();
        vv.get_add1();
        vv.get_add2();
        vv.sq();
    }
}
