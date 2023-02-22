package edu.bu.met.cs665;

public class Driver {
    private String driverName;

    public Driver(String name) {
        this.driverName = name;
    }
    public void newOrder(Request deliveryRequest) {
        System.out.println(driverName + " received delivery request!");
    }

    public String getDriver(){
        return driverName;
    }

}
