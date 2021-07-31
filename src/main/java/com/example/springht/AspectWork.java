package com.example.springht;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectWork {

    @Before("execution(* com.example.springht.SendService.send())")
    public void before() {
        System.out.println("Сейчас будет вызван метод send");
    }

    @After("execution(* com.example.springht.SendService.send())")
    public void after() {
        System.out.println("Был вызван метод send");
    }

    @AfterThrowing("execution(* com.example.springht.SendService.sendException())")
    public void throwExc() {
        System.out.println("Была сгенерирована ошибка");
    }
}
