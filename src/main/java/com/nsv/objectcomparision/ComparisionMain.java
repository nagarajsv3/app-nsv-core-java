package com.nsv.objectcomparision;

public class ComparisionMain {
    public static void main(String[] args) {
        Customer peter = new Customer(1,"Peter");
        Customer parker = new Customer(1,"Peter");

        System.out.println(peter == parker);
        System.out.println(peter.equals(parker));

        System.out.println("a".compareTo("b"));
        System.out.println("aa".compareTo("bb"));




    }
}
