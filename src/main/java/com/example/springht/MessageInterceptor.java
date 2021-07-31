package com.example.springht;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MessageInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args = methodInvocation.getArguments();
        String message = (String) args[0];
        System.out.println("Сообщение перехвачено: " + message);
        return methodInvocation.proceed();
    }
}
