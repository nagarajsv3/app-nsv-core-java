package com.nsv.inheritance;

import lombok.*;

@Getter
@Setter
@ToString(exclude = {"city"})
public class Person {

    @NonNull
    private String name;
    private String city;
    private String title;

    public Person() {
        System.out.println("Constructor Chaining Demo - Start - Parent Class Constructor");
    }

    public Person(@NonNull String name, String city, String title) {
        this.name = name;
        this.city = city;
        this.title = title;
    }

    public void login(){
        System.out.println("Logging in - System - 1 ");
    }

}
