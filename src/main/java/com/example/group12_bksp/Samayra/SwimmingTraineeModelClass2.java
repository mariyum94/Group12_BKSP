package com.example.group12_bksp.Samayra;

import java.time.LocalDate;

public class SwimmingTraineeModelClass2 {
    private int LapTime;
    private int  RestDuration;
    private LocalDate sessionDate;

    public SwimmingTraineeModelClass2(int lapTime, int restDuration, LocalDate sessionDate) {
        LapTime = lapTime;
        RestDuration = restDuration;
        this.sessionDate = sessionDate;
    }

    public int getLapTime() {
        return LapTime;
    }

    public void setLapTime(int lapTime) {
        LapTime = lapTime;
    }

    public int getRestDuration() {
        return RestDuration;
    }

    public void setRestDuration(int restDuration) {
        RestDuration = restDuration;
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

    @Override
    public String toString() {
        return "SwimmingTraineeModelClass2{" +
                "LapTime=" + LapTime +
                ", RestDuration=" + RestDuration +
                ", sessionDate=" + sessionDate +
                '}';
    }
}
