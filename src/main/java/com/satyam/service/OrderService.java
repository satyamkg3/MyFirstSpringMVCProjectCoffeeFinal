package com.satyam.service;

import com.satyam.bean.Order;

import java.util.List;

public interface OrderService {
    public double calculateBill(Order order);
    public List getDetails(Order order);
    public void placeOrder(Order order);
}
