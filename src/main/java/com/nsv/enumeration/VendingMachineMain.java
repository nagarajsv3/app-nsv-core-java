package com.nsv.enumeration;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setDenomination(Denomination.DIME);
        System.out.println(vendingMachine.getDenomination().getDenomValue()+" "+vendingMachine.getDenomination().name());

        for (Denomination denom: Denomination.values()) {
            System.out.println(denom.name()+" "+denom.getDenomValue()+" "+denom.ordinal());
        }

    }
}
