package edu.bu.met.cs665;

public class Driver implements Observer {
    // driver name
    private String driverName;

    public Driver(String name) {
        this.driverName = name;
    }

    @Override
    public void update(DeliveryRequest deliveryRequest) {
        System.out.println(driverName + " received delivery request!");
    }
}
