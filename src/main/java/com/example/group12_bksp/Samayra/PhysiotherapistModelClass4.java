package com.example.group12_bksp.Samayra;

public class PhysiotherapistModelClass4 {
    private String chooseAthlete;
    private String exercise;
    private String rep;
    private String sets;
    private String duration;

    public PhysiotherapistModelClass4(String chooseAthlete, String exercise, String rep, String sets, String duration) {
        this.chooseAthlete = chooseAthlete;
        this.exercise = exercise;
        this.rep = rep;
        this.sets = sets;
        this.duration = duration;
    }

    public String getChooseAthlete() {
        return chooseAthlete;
    }

    public void setChooseAthlete(String chooseAthlete) {
        this.chooseAthlete = chooseAthlete;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getRep() {
        return rep;
    }

    public void setRep(String rep) {
        this.rep = rep;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "PhysiotherapistModelClass4{" +
                "chooseAthlete='" + chooseAthlete + '\'' +
                ", exercise='" + exercise + '\'' +
                ", rep='" + rep + '\'' +
                ", sets='" + sets + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
