package edu.bu.met.cs665;
/**
 * Subject Interface for the Observer pattern
 * Course: CS665
 * Assignment: 2
 * Author: Haizhou Li
 * Version: 02/20/2023
 */

public interface Subject {
    // add subscribers
    public void registerObserver(Observer observer);
    // remove subscribers
    public void removeObserver(Observer observer);
    // notify subscribers
    public void notifyObserver();
}
