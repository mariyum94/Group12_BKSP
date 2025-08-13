package com.example.group12_bksp.Mansura;

public class CTraineemodel7 {

    private String playerName;
    private String role;
    private int jerseyNumber;
    private String position;


    public CTraineemodel7(String playerName, String role, int jerseyNumber, String position) {
        this.playerName = playerName;
        this.role = role;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "CTraineemodel7{" +
                "playerName='" + playerName + '\'' +
                ", role='" + role + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", position='" + position + '\'' +
                '}';
    }
}
