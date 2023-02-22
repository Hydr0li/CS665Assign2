package edu.bu.met.cs665;

public interface Order {
    public void NewOrder(Request request);
    // remove subscribers
    public void removeOrder(Request request);
    // notify subscribers

}
