package org.nt.test;

import org.nt.factory.FlipkartFactory;
import org.nt.target.Flipkart;

public class FlipkartTest {
    public static void main(String[] args) {
        Flipkart flipkart = FlipkartFactory.getFlipkart();
        String[] items = {"shirt","trouser","watch"};
        float[] prices = {5000.0f,6000.0f,80000.0f};
        String msg = flipkart.shopping(items,prices);
        System.out.println(msg);
        System.out.println("Hi");

    }
}
