package org.nt.dependents;

public class DTDC implements Courier{
    public DTDC() {
        System.out.println("DTDC : 0 param Constructor");
    }

    @Override
    public String deliver(int orderId) {

        return "Delivering " + orderId+ " order id products using DTDC";
    }
}
