package com.example.group12_bksp.Samayra;

public class SwimmingTraineeModelClass5 {
    private boolean drill1;
    private boolean drill2;
    private boolean drill3;

    public SwimmingTraineeModelClass5(boolean drill1, boolean drill2, boolean drill3) {
        this.drill1 = drill1;
        this.drill2 = drill2;
        this.drill3 = drill3;
    }

    public boolean isDrill1() {
        return drill1;
    }

    public void setDrill1(boolean drill1) {
        this.drill1 = drill1;
    }

    public boolean isDrill2() {
        return drill2;
    }

    public void setDrill2(boolean drill2) {
        this.drill2 = drill2;
    }

    public boolean isDrill3() {
        return drill3;
    }

    public void setDrill3(boolean drill3) {
        this.drill3 = drill3;
    }

    @Override
    public String toString() {
        return "SwimmingTraineeModelClass5{" +
                "drill1=" + drill1 +
                ", drill2=" + drill2 +
                ", drill3=" + drill3 +
                '}';
    }
}
