package com.altshuler.spring;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Rest {
    private ableToWalk ableToWalk;

    public void walk() {
        ableToWalk.walk();
    }
}
