package com.example.game;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SeaBattle {
    ship(1), water(0);
    private Integer value;
}
