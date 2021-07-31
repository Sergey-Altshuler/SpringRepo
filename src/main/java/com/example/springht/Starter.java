package com.example.springht;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        SendService service = context.getBean("sendService", SendService.class);
        Long start = System.currentTimeMillis();
        service.send();
        Long finish = System.currentTimeMillis();
        try{
            service.sendException();
        }
        catch (Exception e) {
            System.out.println("Метод sendException отработал");
        }
        System.out.println("Время выполнения метода send: " + (finish-start) + " миллисекунд");
        context.close();
    }



}
