package com.example.springht.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SimpleAudience implements Audience{
    private int number;

    @Override
    public String toString() {
        return "SimpleAudience{" +
                "number=" + number +
                '}';
    }
}
