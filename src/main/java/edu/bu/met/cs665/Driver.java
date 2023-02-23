package edu.bu.met.cs665;
/**
 * Course: CS665
 * Assignment: 2
 * Author: Haizhou Li
 * Version: 02/20/2023
 */

public class Driver implements Observer {
    // driver name
    private String driverName;

    public Driver(String name) {
        this.driverName = name;
    }

    @Override
    public void update(DeliveryRequest deliveryRequest) {
        System.out.println("You got a new request");
    }

    public String getDriver(){
        return driverName.toString();
    }

}
