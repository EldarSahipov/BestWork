package com.example.game;

import com.example.dao.GamesDao;
import com.example.model.Games;
import lombok.Data;

@Data
public class Game {
    private String gameId;
    private Player player1;
    private Player player2;
    private GameStatus status;
    private int [][] board;
    private SeaBattle winner;
}
