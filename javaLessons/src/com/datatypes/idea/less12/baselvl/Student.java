package com.datatypes.idea.less12.baselvl;

public class Student {
    private String name;
    private int student_id;

    private String group;
    private String napr;

    public String getName() {
        return name;
    }

    public Student(String name, int student_id, String group, String napr) {
        this.name = name;
        this.student_id = student_id;
        this.group = group;
        this.napr = napr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getNapr() {
        return napr;
    }

    public void setNapr(String napr) {
        this.napr = napr;
    }


}

