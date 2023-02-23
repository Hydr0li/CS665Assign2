package edu.bu.met.cs665;
/**
 * Course: CS665
 * Assignment: 2
 * Author: Haizhou Li
 * Version: 02/20/2023
 */

import java.util.ArrayList;
import java.util.List;


public class Shop implements Subject{
    private DeliveryRequest status;
    // store driver
    private List<Observer> list = new ArrayList<Observer>();
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(status);
        }
    }

    public DeliveryRequest getState() {
        return status;
    }

    public void setStatus(DeliveryRequest status) {
        this.status = status;
        notifyObserver();
    }
}
