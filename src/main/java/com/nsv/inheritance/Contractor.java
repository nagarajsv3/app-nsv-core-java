package com.nsv.inheritance;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Contractor extends Person {

    @NonNull
    private double hourlyPay;

    public Contractor() {
    }

    public Contractor(@NonNull double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void changeContractor(){

    }
}
