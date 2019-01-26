package com.nsv.inheritance;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Employee extends Person {

    @NonNull
    private double salary;

    public Employee() {
        System.out.println("Constructor Chaining Demo - End - Child Class Constructor");
    }

    public Employee(@NonNull double salary) {
        this();
        this.salary = salary;
    }

    public Employee(@NonNull String name, String city, String title, @NonNull double salary) {
        super(name, city, title);
        this.salary = salary;
    }


    @Override
    public void login(){
        super.login();
        System.out.println("Logging in - System - 2 ");
    }

    public void changeEmployee(){

    }


}
