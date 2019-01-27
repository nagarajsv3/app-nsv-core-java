package com.nsv.absinterfaces;

public class Cat extends Animal implements Pet,PetStore {
    public void run() {
        System.out.println("cat - run");
    }

    public void eat() {
        System.out.println("cat - eat");
    }

    public boolean isPetCute() {
        System.out.println("Cat is not cute");
        return false;
    }

    public boolean isAvailableInPetStore() {
        return false;
    }
}
