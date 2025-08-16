package com.example.group12_bksp.ROMTAHENA;

import java.io.Serializable;

public class CricketCoachModelClass3 implements Serializable {
    private String match;
    private String date;
    private String opponent;
    private String batRuns;
    private String batBalls;
    private String bowlRuns;
    private String bowlWickets;
    private String fitness;

    public CricketCoachModelClass3(String match, String date, String opponent, String batRuns, String batBalls, String bowlRuns, String bowlWickets, String fitness) {
        this.match = match;
        this.date = date;
        this.opponent = opponent;
        this.batRuns = batRuns;
        this.batBalls = batBalls;
        this.bowlRuns = bowlRuns;
        this.bowlWickets = bowlWickets;
        this.fitness = fitness;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public String getBatRuns() {
        return batRuns;
    }

    public void setBatRuns(String batRuns) {
        this.batRuns = batRuns;
    }

    public String getBatBalls() {
        return batBalls;
    }

    public void setBatBalls(String batBalls) {
        this.batBalls = batBalls;
    }

    public String getBowlRuns() {
        return bowlRuns;
    }

    public void setBowlRuns(String bowlRuns) {
        this.bowlRuns = bowlRuns;
    }

    public String getBowlWickets() {
        return bowlWickets;
    }

    public void setBowlWickets(String bowlWickets) {
        this.bowlWickets = bowlWickets;
    }

    public String getFitness() {
        return fitness;
    }

    public void setFitness(String fitness) {
        this.fitness = fitness;
    }

    @Override
    public String toString() {
        return "CricketCoachModelClass3{" +
                "match='" + match + '\'' +
                ", date='" + date + '\'' +
                ", opponent='" + opponent + '\'' +
                ", batRuns='" + batRuns + '\'' +
                ", batBalls='" + batBalls + '\'' +
                ", bowlRuns='" + bowlRuns + '\'' +
                ", bowlWickets='" + bowlWickets + '\'' +
                ", fitness='" + fitness + '\'' +
                '}';
    }

}
