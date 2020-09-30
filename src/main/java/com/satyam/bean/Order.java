package com.satyam.bean;

import javax.persistence.*;

@Entity
@Table(name = "placeOrder")
public class Order {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderID;
    private Integer coffeeID;
    private Integer addOnID;
    private Integer sizeID;
    private Integer couponID;
    private Double totalPrice;



    public Order() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCoffeeID() {
        return coffeeID;
    }

    public void setCoffeeID(int coffeeID) {
        this.coffeeID = coffeeID;
    }


    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public int getAddOnID() {
        return addOnID;
    }

    public void setAddOnID(int addOnID) {
        this.addOnID = addOnID;
    }

    public int getCouponID() {
        return couponID;
    }

    public void setCouponID(int couponID) {
        this.couponID = couponID;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
