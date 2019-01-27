package com.nsv.absinterfaces;

public class Dog extends Animal implements Pet, PetStore{
    public void run() {
        System.out.println("dog - run");
    }

    public void eat() {
        System.out.println("dog - eat");
    }

    public boolean isPetCute() {
        return false;
    }

    public boolean isAvailableInPetStore() {
        return false;
    }
}
