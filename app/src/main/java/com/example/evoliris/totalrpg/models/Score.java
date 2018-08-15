package com.example.evoliris.totalrpg.models;

public class Score {
    private long id;
    private String playerName;
    private int score;

    public Score(long id, String playerName, long score){

    }

    public Score(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
