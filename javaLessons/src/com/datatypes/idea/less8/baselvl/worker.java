package com.datatypes.idea.less8.baselvl;

import java.util.Scanner;

public class worker extends Student {
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        worker person = new worker();

        System.out.print("Введите имя студента: ");
        person.setName(scan.nextLine());
        System.out.print("Введите его возраст: ");
        person.setAge(scan.nextInt());
        System.out.print("Введите его з/п: ");
        person.setSalary(scan.nextInt());
        System.out.println("\nИмя: " + person.getName() + "\nВозраст: " + person.getAge() + "\nДоход: " + person.getSalary() + " руб.");
    }
}
