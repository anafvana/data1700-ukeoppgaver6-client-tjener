package com.example.demo;

public class Operation {
    private double v1;
    private double v2;
    private String op;

    public Operation(float v1, float v2, String op) {
        this.v1 = v1;
        this.v2 = v2;
        this.op = op;
    }

    public Operation(){
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}

