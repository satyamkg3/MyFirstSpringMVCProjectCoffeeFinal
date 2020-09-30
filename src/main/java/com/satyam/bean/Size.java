package com.satyam.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Size {
    @Id
    private int sizeID;
    private String sizeName;
    private double price;

    public Size() {
    }

    public Size(int sizeID, String sizeName, double ratio) {
        this.sizeID = sizeID;
        this.sizeName = sizeName;
        this.price = ratio;
    }

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double ratio) {
        this.price = ratio;
    }

    @Override
    public String toString() {
        return "Size{" +
                "sizeID=" + sizeID +
                ", sizeName='" + sizeName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return sizeID == size.sizeID &&
                Double.compare(size.price, price) == 0 &&
                sizeName.equals(size.sizeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeID, sizeName, price);
    }
}
