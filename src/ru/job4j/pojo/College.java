package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Shishkin Nikolas Sidney");
        student.setGroup(1101);
        student.setAdmission(new Date());

        System.out.println("Student : " + student.getFio() + " from " + student.getGroup() + ", has admission in " + student.getAdmission());
    }
}
