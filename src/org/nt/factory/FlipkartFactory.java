package org.nt.factory;

import org.nt.dependents.Courier;
import org.nt.target.Flipkart;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.rmi.AccessException;
import java.util.Properties;

public class FlipkartFactory {
    private static Properties properties;
    static {
        try{
            properties = new Properties();
            FileInputStream fis = new FileInputStream("src/org/nt/commons/info.properties");
            properties.load(fis);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Flipkart getFlipkart(){
        try{
            String courierClassName = properties.getProperty("courier.type");
            Class c = Class.forName(courierClassName);
            Constructor cons[] = c.getDeclaredConstructors();
            Courier courier = (Courier) cons[0].newInstance();
            Flipkart flipkart = new Flipkart();
            flipkart.setCourier(courier);
            return flipkart;

        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
        catch (InstantiationException e){
            e.printStackTrace();
            return null;
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
            return null;
        }
        catch (InvocationTargetException e){
            e.printStackTrace();
            return null;
        }
    }
}
