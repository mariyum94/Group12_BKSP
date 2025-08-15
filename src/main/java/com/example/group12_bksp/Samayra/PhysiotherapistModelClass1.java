package com.example.group12_bksp.Samayra;

public class PhysiotherapistModelClass1 {
    private String name;
    private String injuryType;
    private String severity;
    private String remarks;

    public PhysiotherapistModelClass1(String name, String injuryType, String severity, String remarks) {
        this.name = name;
        this.injuryType = injuryType;
        this.severity = severity;
        this.remarks = remarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInjuryType() {
        return injuryType;
    }

    public void setInjuryType(String injuryType) {
        this.injuryType = injuryType;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "PhysiotherapistModelClass1{" +
                "name='" + name + '\'' +
                ", injuryType='" + injuryType + '\'' +
                ", severity='" + severity + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
