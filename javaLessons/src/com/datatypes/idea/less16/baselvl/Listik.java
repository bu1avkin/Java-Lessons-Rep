package com.datatypes.idea.less16.baselvl;

import java.util.Scanner;
public abstract class Listik
{
    public String[] zapolnenie()
    {
        Scanner in = new Scanner(System.in);
        int size = 50;
        String[] aa = new String[size];
        for (int i = 0; i < size; i++)
        {
            System.out.println("Введите элемент с индексом " + i);
            aa[i] = in.next();
        }
        return aa;
    }

    public abstract String[] zapolnenie1();
}
