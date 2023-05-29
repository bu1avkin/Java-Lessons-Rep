package com.datatypes.idea.less13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listik {
    protected List<Integer> random() {
        List<Integer> list1 = new ArrayList<>(10);
        for(int i = 0; i <= 10; i++){
            list1.add((int) (Math.random() * 10));
        }
        System.out.print("Рандомные числа: ");
        System.out.println(list1);
        return list1;
    }

    protected List<String> input(){
        Scanner sc = new Scanner(System.in);
        List<String> list2 = new ArrayList<>(10);
        for(int i = 0; i < 10; i++){
            System.out.print("Введите строку: ");
            String string_in = sc.next();
            list2.add(string_in);
        }
        System.out.print("Строки: ");
        System.out.println(list2);
        return list2;
    }
}
