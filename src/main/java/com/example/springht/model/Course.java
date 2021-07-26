package com.example.springht.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private String title;
    private List<Student> students;
    @Autowired
    @Qualifier("hall")
    private Audience audience;

    public void printStudents(){
        System.out.println("Students of the course:");
        for (Student student: students){
            System.out.println(student.getNameAndSurname());
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", audience=" + audience +
                '}';
    }
}
