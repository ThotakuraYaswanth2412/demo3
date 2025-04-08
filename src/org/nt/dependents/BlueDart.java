package org.nt.dependents;

public class BlueDart implements Courier{
    public BlueDart() {
        System.out.println("BlueDart : 0 param Constructor");
    }

    @Override
    public String deliver(int orderId) {
        return "Delivering " + orderId+ " order id products using BlueDart";
    }
}
