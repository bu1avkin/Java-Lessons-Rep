package com.datatypes.idea.less12.baselvl;

import java.util.*;

public class Student_a extends Student {
    int id;
    String name;
    String group;
    String napr;
    int course;

    public Student_a(String name, int student_id, String group, String napr, int course) {
        super(name, student_id, group, napr);
        this.course = course;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student_a> a = new ArrayList<>();
        List<Student_a> b = new ArrayList<>();
        List<String> names = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Введите id студента");
            int id1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите имя студента");
            String name1 = sc.nextLine();
            System.out.println("Введите группу студента");
            String group1 = sc.nextLine();
            System.out.println("Введите направление студента");
            String napr1 = sc.nextLine();
            System.out.println("Введите курс студента");
            int course = sc.nextInt();
            Student_a student_a = new Student_a(name1, id1, group1, napr1, course);
            a.add(student_a);
            names.add(name1);
        }
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        System.out.printf("Имя ", "Id ", "Группа ", "Направление \n");
        for (Student student_a : a) {
            if (Objects.equals(student_a.getName(), names.get(0))) {
                System.out.printf(student_a.getName(), student_a.getStudent_id(), student_a.getGroup(), student_a.getNapr());
            }
        }
        for (Student student_a : a) {
            if (Objects.equals(student_a.getName(), names.get(1))) {
                System.out.printf(student_a.getName(), student_a.getStudent_id(), student_a.getGroup(), student_a.getNapr());
            }
        }
    }
}
