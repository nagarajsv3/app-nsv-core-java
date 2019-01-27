package com.nsv.absinterfaces;

public class InterfacesMain {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal Dog = new Dog();
        cat.eat();
        cat.run();
        cat.happy();

        Pet pcat = new Cat();
        System.out.println(pcat.isPetCute());
        ((Cat)pcat).eat();
        ((Cat)pcat).run();


    }


}
