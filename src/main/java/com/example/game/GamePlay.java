package com.example.game;

import lombok.Data;

@Data
public class GamePlay {
    private SeaBattle type;
    private Integer coordinateX;
    private Integer coordinateY;
    private String gameId;
}
