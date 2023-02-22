package edu.bu.met.cs665;

public class Client {
    public void test() {
        // create shop
        Shop shop = new Shop();

        // create drivers;
        Driver driver1 = new Driver("driver1");
        Driver driver2 = new Driver("driver2");
        Driver driver3 = new Driver("driver3");
        Driver driver4 = new Driver("driver4");
        Driver driver5 = new Driver("driver5");

        // create notification
        DeliveryRequest deliveryRequest = new DeliveryRequest();

        // register driver for shop
        shop.registerObserver(driver1);
        shop.registerObserver(driver2);
        shop.registerObserver(driver3);
        shop.registerObserver(driver4);
        shop.registerObserver(driver5);

        // notify drivers when shop has delivery request
        shop.setState(deliveryRequest);
    }
}
