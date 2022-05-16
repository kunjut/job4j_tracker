package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private String group;
    private LocalDate dateOfEnter;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getDateOfEnter() {
        return dateOfEnter;
    }

    public void setDateOfEnter(LocalDate dateOfEnter) {
        this.dateOfEnter = dateOfEnter;
    }
}
