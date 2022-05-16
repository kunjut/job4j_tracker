package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Petrov Ivan Sidorovich");
        student.setGroup("FIT");
        student.setDateOfEnter(LocalDate.of(2020, 1, 1));
        System.out.println(
                "Student " + student.getFullName()
                + " entered to college in " + student.getGroup()
                + " at " + student.getDateOfEnter()
        );
    }
}
