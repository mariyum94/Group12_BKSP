package com.example.group12_bksp.Samayra;

public class PhysiotherapistModelClass2 {
    private String nameRecCB;
    private String instructionTextArea;

    public PhysiotherapistModelClass2(String nameRecCB, String instructionTextArea) {
        this.nameRecCB = nameRecCB;
        this.instructionTextArea = instructionTextArea;
    }

    public String getNameRecCB() {
        return nameRecCB;
    }

    public void setNameRecCB(String nameRecCB) {
        this.nameRecCB = nameRecCB;
    }

    public String getInstructionTextArea() {
        return instructionTextArea;
    }

    public void setInstructionTextArea(String instructionTextArea) {
        this.instructionTextArea = instructionTextArea;
    }

    @Override
    public String toString() {
        return "PhysiotherapistModelClass2{" +
                "nameRecCB='" + nameRecCB + '\'' +
                ", instructionTextArea='" + instructionTextArea + '\'' +
                '}';
    }
}
