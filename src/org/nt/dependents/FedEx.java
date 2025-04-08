package org.nt.dependents;

public class FedEx implements Courier{
    public FedEx() {
        System.out.println("FedEx : 0 param Constructor");
    }

    @Override
    public String deliver(int orderId) {
        return "Delivering " + orderId+ " order id products using FedEx";
    }
}
