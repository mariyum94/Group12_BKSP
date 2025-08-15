package com.example.group12_bksp.Samayra;

import java.time.LocalDate;

public class SwimmingTraineeModelClass4 {
    private String CoachComboBox;
    private String TimeCombo;
    private LocalDate FlipDate;

    public SwimmingTraineeModelClass4(String coachComboBox, String timeCombo, LocalDate flipDate) {
        CoachComboBox = coachComboBox;
        TimeCombo = timeCombo;
        FlipDate = flipDate;
    }

    public String getCoachComboBox() {
        return CoachComboBox;
    }

    public void setCoachComboBox(String coachComboBox) {
        CoachComboBox = coachComboBox;
    }

    public String getTimeCombo() {
        return TimeCombo;
    }

    public void setTimeCombo(String timeCombo) {
        TimeCombo = timeCombo;
    }

    public LocalDate getFlipDate() {
        return FlipDate;
    }

    public void setFlipDate(LocalDate flipDate) {
        FlipDate = flipDate;
    }

    @Override
    public String toString() {
        return "SwimmingTraineeModelClass4{" +
                "CoachComboBox='" + CoachComboBox + '\'' +
                ", TimeCombo='" + TimeCombo + '\'' +
                ", FlipDate=" + FlipDate +
                '}';
    }
}
