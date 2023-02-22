package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestShop {

    public void testDrivers(){
        Driver driver1 = new Driver("driver1");
        assertEquals("New Order", driver1.getDriver());
        Driver driver2 = new Driver("driver2");
        assertEquals("New Order", driver2.getDriver());
        Driver driver3 = new Driver("driver3");
        assertEquals("New Order", driver3.getDriver());
        Driver driver4 = new Driver("driver4");
        assertEquals("New Order", driver4.getDriver());
        Driver driver5 = new Driver("driver5");
        assertEquals("New Order", driver5.getDriver());
    }
    public void testShop(){
        Shop shop = new Shop();

        // create drivers;
        Driver driver1 = new Driver("driver1");
        Driver driver2 = new Driver("driver2");
        Driver driver3 = new Driver("driver3");
        Driver driver4 = new Driver("driver4");
        Driver driver5 = new Driver("driver5");

        // create notification
        Request deliveryRequest = new Request();

        // register driver for shop
        shop.NewOrder(deliveryRequest);
        shop.NewOrder(deliveryRequest);
        shop.NewOrder(deliveryRequest);
        shop.NewOrder(deliveryRequest);
        shop.NewOrder(deliveryRequest);
        assertEquals("New Order", shop.toString());

        // notify drivers when shop has delivery request
        shop.setStatus(deliveryRequest);

    }
}
