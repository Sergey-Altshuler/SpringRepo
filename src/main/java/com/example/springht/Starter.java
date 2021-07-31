package com.example.springht;

import org.springframework.aop.framework.ProxyFactory;

public class Starter {
    private static SendService target;
    private static SendService proxy;
    private static final String MESSAGE = "Сообщение 1";

    public static void init(){
        target = new SendService();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new MessageInterceptor());
        proxyFactory.setTarget(target);
        proxy = (SendService) proxyFactory.getProxy();
    }
    public static void main(String[] args) {
        init();
        process(MESSAGE);
        System.out.println("-------------");
        processProxy(MESSAGE);
        processProxy(MESSAGE);

    }
    public static void process (String message){
        target.send(message);
    }
    public static void processProxy (String message){
        proxy.send(message);
    }

}
