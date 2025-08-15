package com.example.group12_bksp.Samayra;

public class SwimmingTraineeModelClass6 {
    private int holdTime;
    private int pulseRate;
    private String disease;

    public SwimmingTraineeModelClass6(int holdTime, int pulseRate, String disease) {
        this.holdTime = holdTime;
        this.pulseRate = pulseRate;
        this.disease = disease;
    }

    public int getHoldTime() {
        return holdTime;
    }

    public void setHoldTime(int holdTime) {
        this.holdTime = holdTime;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "SwimmingTraineeModelClass6{" +
                "holdTime=" + holdTime +
                ", pulseRate=" + pulseRate +
                ", disease='" + disease + '\'' +
                '}';
    }
}
