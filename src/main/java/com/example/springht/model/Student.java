package com.example.springht.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private Double avgMark;
    private List<String> subjects;

    public String getNameAndSurname() {
        return name + " " + surname;
    }

    @Override
    public int compareTo(Student o) {
        return avgMark.compareTo(o.avgMark);
    }
}
