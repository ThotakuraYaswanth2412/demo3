package org.nt.target;

import org.nt.dependents.Courier;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
    private Courier courier;
    public Flipkart() {
        System.out.println("Flipkart : 0 - param Constructor");
    }
    public void setCourier(Courier courier) {
        this.courier = courier;
    }
    public String shopping(String [] items, float[] prices){
        float bill_Amount = 0.0f;
        for( float price :prices){
            bill_Amount += price;
        }
        int orderId = new Random().nextInt(100);
        String msg = courier.deliver(orderId);
        return Arrays.toString(items)+" with prices "+Arrays.toString(prices)+ "having bill_Anmount "+bill_Amount+" ::::"+msg;
    }

}
