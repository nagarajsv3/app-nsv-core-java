package com.nsv.enumeration;

public class OrderMain {

    public static void main(String[] args) {
        Order order = new Order();
        order.setStatus(Status.PLACED);
        System.out.println(order.getStatus().name()+" "+order.getStatus().ordinal());
        order.setStatus(Status.SHIPPED);
        System.out.println(order.getStatus().name()+" "+order.getStatus().ordinal());
        order.setStatus(Status.CANCELLED);
        System.out.println(order.getStatus().name()+" "+order.getStatus().ordinal());
        order.setStatus(Status.FULFILLED);
        System.out.println(order.getStatus().name()+" "+order.getStatus().ordinal());



    }
}
