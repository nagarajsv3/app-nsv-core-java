package com.nsv.inheritance;

import lombok.*;

@Getter
@Setter
@ToString(exclude = {"city"})
/**
 * @author Naga
 */
public class Person {

    @NonNull
    /**
     @parameter name
     name parameter to store name of person
     */
    private String name;
    private String city;
    private String title;

    public Person() {
        System.out.println("Constructor Chaining Demo - Start - Parent Class Constructor");
    }

    /**
     *
     * @param name name of the person
     * @param city city where person lives
     * @param title title of the person
     */
    public Person(String name, String city, String title) {
        this.name = name;
        this.city = city;
        this.title = title;
    }

    /**
     * login() method printing login info
     */
    public void login(){
        System.out.println("Logging in - System - 1 ");
    }

}
