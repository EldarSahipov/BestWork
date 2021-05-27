package com.example.dao;

import com.example.model.Games;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class GamesDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GamesDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addNewGame(Games games) {
        jdbcTemplate.update("INSERT INTO games VALUES(default ,?,?,?,?,?,?)",
                games.getUser1(), games.getUser2(),
                games.getWinner(), games.getStart_date(), games.getEnd_date(), games.getGameId());
    }
}
