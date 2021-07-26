package com.example.springht.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hall implements Audience{
    private int number;
    private String dimensions;
    private int floor;

    @Override
    public String toString() {
        return "Hall{" +
                "number=" + number +
                ", dimensions='" + dimensions + '\'' +
                ", floor=" + floor +
                '}';
    }
}
