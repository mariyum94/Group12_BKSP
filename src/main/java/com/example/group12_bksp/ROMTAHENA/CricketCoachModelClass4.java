package com.example.group12_bksp.ROMTAHENA;

import java.io.Serializable;

public class CricketCoachModelClass4 implements Serializable {
    private String drillName;
    private String drillType;
    private String duration;

    public CricketCoachModelClass4(String drillName, String drillType, String duration) {
        this.drillName = drillName;
        this.drillType = drillType;
        this.duration = duration;
    }

    public String getDrillName() {
        return drillName;
    }

    public void setDrillName(String drillName) {
        this.drillName = drillName;
    }

    public String getDrillType() {
        return drillType;
    }

    public void setDrillType(String drillType) {
        this.drillType = drillType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "CricketCoachModelClass4{" +
                "drillName='" + drillName + '\'' +
                ", drillType='" + drillType + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
