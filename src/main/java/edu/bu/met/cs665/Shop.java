package edu.bu.met.cs665;
import java.util.ArrayList;
import java.util.List;
public class Shop {
    private Request status;
    // store driver
    private List<String> driverList = new ArrayList<String>();

    public void NewOrder(Request orderrequest) {
        driverList.add("New Order");
    }

    public void removeOrder(Request observer) {
        driverList.remove("New Order");
    }

    public Request getStatus() {
        return status;
    }

    public void setStatus(Request status) {
        this.status = status;
    }
}
