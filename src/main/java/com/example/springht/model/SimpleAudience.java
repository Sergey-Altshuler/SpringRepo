package com.example.springht.model;

import com.example.springht.annotations.SimpleAudienceAnnotated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SimpleAudienceAnnotated
public class SimpleAudience implements Audience{
    private int number;

    @Override
    public String toString() {
        return "SimpleAudience{" +
                "number=" + number +
                '}';
    }
}
