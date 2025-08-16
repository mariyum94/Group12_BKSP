package com.example.group12_bksp.Samayra;

public class PhysiotherapistModelClass3 {
    private String athlete3;
    private String prevInjury;
    private int score3;
    private String note3;

    public PhysiotherapistModelClass3(String athlete3, String prevInjury, int score3, String note3) {
        this.athlete3 = athlete3;
        this.prevInjury = prevInjury;
        this.score3 = score3;
        this.note3 = note3;
    }

    public String getAthlete3() {
        return athlete3;
    }

    public void setAthlete3(String athlete3) {
        this.athlete3 = athlete3;
    }

    public String getPrevInjury() {
        return prevInjury;
    }

    public void setPrevInjury(String prevInjury) {
        this.prevInjury = prevInjury;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    @Override
    public String toString() {
        return "PhysiotherapistModelClass3{" +
                "athlete3='" + athlete3 + '\'' +
                ", prevInjury='" + prevInjury + '\'' +
                ", score3=" + score3 +
                ", note3='" + note3 + '\'' +
                '}';
    }
}
