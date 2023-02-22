package edu.bu.met.cs665;

public interface Subject {
    // add subscribers
    public void registerObserver(Observer observer);
    // remove subscribers
    public void removeObserver(Observer observer);
    // notify subscribers
    public void notifyObserver();
}
