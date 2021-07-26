package com.example.springht;

import com.example.springht.model.Course;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    private static final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

    public static void main(String[] args) {
        displayCourse("courseMore5");
        displayCourse("courseLess5");
        displayCourse("courseMax");
        displayCourse("courseMin");
    }

    private static void displayCourse(String beanName) {
        Course course = context.getBean(beanName, Course.class);
        System.out.println(course);
        course.printStudents();
    }
}
