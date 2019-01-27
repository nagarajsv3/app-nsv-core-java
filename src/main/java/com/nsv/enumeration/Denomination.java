package com.nsv.enumeration;

public enum Denomination {
    NICKLE(5),
    DIME(10),
    QUARTER(25);

    private int denomValue;

    private Denomination(int denomValue){
        this.denomValue = denomValue;
    }

    public int getDenomValue() {
        return denomValue;
    }

    public void setDenomValue(int denomValue) {
        this.denomValue = denomValue;
    }
}
