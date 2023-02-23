package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestShop {

    public void testGetDriver(){
        DeliveryRequest request = new DeliveryRequest();
        Driver driver1 = new Driver("driver1");
        assertEquals("driver1", driver1.getDriver());
        Driver driver2 = new Driver("driver2");
        assertEquals("driver2", driver2.getDriver());
        Driver driver3 = new Driver("driver3");
        assertEquals("driver3", driver3.getDriver());
        Driver driver4 = new Driver("driver4");
        assertEquals("driver4", driver4.getDriver());
        Driver driver5 = new Driver("driver5");
        assertEquals("driver5", driver5.getDriver());
    }




}
