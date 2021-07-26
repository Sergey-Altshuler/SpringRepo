package com.example.springht.model;

import com.example.springht.annotations.HallAnnotated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@HallAnnotated
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
