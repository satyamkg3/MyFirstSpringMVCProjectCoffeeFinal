package com.satyam.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddOns {
    @Id
    private int addOnID;
    private String addOnName;
    private double price;

    public AddOns() {
    }

    public AddOns(int addOnID, String addOnName, double price) {
        this.addOnID = addOnID;
        this.addOnName = addOnName;
        this.price = price;
    }

    public int getAddOnID() {
        return addOnID;
    }

    public void setAddOnID(int addOnID) {
        this.addOnID = addOnID;
    }

    public String getAddOnName() {
        return addOnName;
    }

    public void setAddOnName(String addOnName) {
        this.addOnName = addOnName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
