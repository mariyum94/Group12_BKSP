package com.example.group12_bksp.Samayra;

public class SwimmingTraineeModelClass1 {
    private String difficultyLevel;
    private int breathCount;
    private int strokeCount;

    public SwimmingTraineeModelClass1(String difficultyLevel, int breathCount, int strokeCount) {
        this.difficultyLevel = difficultyLevel;
        this.breathCount = breathCount;
        this.strokeCount = strokeCount;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getBreathCount() {
        return breathCount;
    }

    public void setBreathCount(int breathCount) {
        this.breathCount = breathCount;
    }

    public int getStrokeCount() {
        return strokeCount;
    }

    public void setStrokeCount(int strokeCount) {
        this.strokeCount = strokeCount;
    }

    @Override
    public String toString() {
        return "SwimmingTraineeModelClass1{" +
                "difficultyLevel='" + difficultyLevel + '\'' +
                ", breathCount=" + breathCount +
                ", strokeCount=" + strokeCount +
                '}';
    }
}
