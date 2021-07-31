package com.example.springht;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendService {
    private String message;

    public void send() {
        System.out.println("Сообщение отправлено: " + message);
    }

    public void sendException() throws Exception {
        System.out.println("Выброшено исключение");
        throw new Exception();

    }
}
