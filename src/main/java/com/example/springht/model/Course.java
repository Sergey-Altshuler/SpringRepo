package com.example.springht.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private String title;
    private List<Student> students;

    public void printStudents(){
        System.out.println("Students of the course:");
        for (Student student: students){
            System.out.println(student.getNameAndSurname());
        }
    }
    public String toString() {
        return "title of course: " + title;
    }
}
