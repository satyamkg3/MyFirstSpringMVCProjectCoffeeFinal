package com.satyam.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Discount {
    @Id
    private int couponID;
    private String couponName;
    private int minCost;
    private int percentage;

    public Discount() {
    }

    public Discount(int couponID, String couponName, int minCost, int percentage) {
        this.couponID = couponID;
        this.couponName = couponName;
        this.minCost = minCost;
        this.percentage = percentage;
    }

    public int getCouponID() {
        return couponID;
    }

    public void setCouponID(int couponID) {
        this.couponID = couponID;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public int getMinCost() {
        return minCost;
    }

    public void setMinCost(int minCost) {
        this.minCost = minCost;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "couponID=" + couponID +
                ", couponName='" + couponName + '\'' +
                ", minCost=" + minCost +
                ", percentage=" + percentage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount = (Discount) o;
        return couponID == discount.couponID &&
                minCost == discount.minCost &&
                percentage == discount.percentage &&
                couponName.equals(discount.couponName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponID, couponName, minCost, percentage);
    }
}
