package com.example.springht;

import org.springframework.stereotype.Service;

@Service("sendService")
public class SendService {

    public void send() {
        System.out.println("Сообщение отправлено: " + MessageConstants.MESSAGE);
    }

    public void sendException() throws Exception {
        System.out.println("Выброшено исключение");
        throw new Exception();

    }
}
