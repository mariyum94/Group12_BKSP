package com.example.group12_bksp.Samayra;

public class SwimmingTraineeModelClass3 {
    private String feedback;

    public SwimmingTraineeModelClass3(String feedback) {
        this.feedback = feedback;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "SwimmingTraineeModelClass3{" +
                "feedback='" + feedback + '\'' +
                '}';
    }
}
