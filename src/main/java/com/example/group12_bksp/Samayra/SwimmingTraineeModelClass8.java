package com.example.group12_bksp.Samayra;

public class SwimmingTraineeModelClass8 {
    private String MeetCombo;

    public SwimmingTraineeModelClass8(String meetCombo) {
        MeetCombo = meetCombo;
    }

    public String getMeetCombo() {
        return MeetCombo;
    }

    public void setMeetCombo(String meetCombo) {
        MeetCombo = meetCombo;
    }

    @Override
    public String toString() {
        return "SwimmingTraineeModelClass8{" +
                "MeetCombo='" + MeetCombo + '\'' +
                '}';
    }
}
