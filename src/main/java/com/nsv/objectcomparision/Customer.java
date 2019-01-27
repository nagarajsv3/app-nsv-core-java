package com.nsv.objectcomparision;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Getter
@Setter
public class Customer {

    private int id;
    private String name;

    public Customer(){}
    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getId() == customer.getId() && getName().equals(customer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
