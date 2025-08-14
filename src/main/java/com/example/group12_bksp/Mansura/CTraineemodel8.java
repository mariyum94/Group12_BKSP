package com.example.group12_bksp.Mansura;

import java.time.LocalDate;

public class CTraineemodel8 {

    private LocalDate matchDate;
    private String opponent;
    private String matchType;
    private String result;
    private String score;
    private String summary;

    // Constructor
    public CTraineemodel8(LocalDate matchDate, String opponent, String matchType,
                          String result, String score, String summary) {
        this.matchDate = matchDate;
        this.opponent = opponent;
        this.matchType = matchType;
        this.result = result;
        this.score = score;
        this.summary = summary;
    }

    // Getters and Setters
    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    // toString method
    @Override
    public String toString() {
        return "CTraineemodel8{" +
                "matchDate=" + matchDate +
                ", opponent='" + opponent + '\'' +
                ", matchType='" + matchType + '\'' +
                ", result='" + result + '\'' +
                ", score='" + score + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}

