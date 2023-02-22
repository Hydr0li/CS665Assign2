package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject{
    private DeliveryRequest state;
    // store driver
    private List<Observer> driverList = new ArrayList<Observer>();
    @Override
    public void registerObserver(Observer observer) {
        driverList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        driverList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : driverList) {
            observer.update(state);
        }
    }

    public DeliveryRequest getState() {
        return state;
    }

    public void setState(DeliveryRequest state) {
        this.state = state;
        notifyObserver();
    }
}
