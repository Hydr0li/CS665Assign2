package edu.bu.met.cs665;

/**
 * Course: CS665
 * Assignment: 2
 * Author: Haizhou Li
 * Version: 02/20/2023
 */

public class Client {
    public void clientShop() {
        // create shop
        Shop shop = new Shop();

        // create drivers;
        Driver driver1 = new Driver("driver1");
        Driver driver2 = new Driver("driver2");
        Driver driver3 = new Driver("driver3");
        Driver driver4 = new Driver("driver4");
        Driver driver5 = new Driver("driver5");

        // Create Requests
        DeliveryRequest deliveryRequest = new DeliveryRequest();

        // Register
        shop.registerObserver(driver1);
        shop.registerObserver(driver2);
        shop.registerObserver(driver3);
        shop.registerObserver(driver4);
        shop.registerObserver(driver5);

        // Notify and srt Status
        shop.setStatus(deliveryRequest);
    }
}
