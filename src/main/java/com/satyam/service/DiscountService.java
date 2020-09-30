package com.satyam.service;

import com.satyam.bean.Discount;

import java.util.List;

public interface DiscountService {
    Discount getCouponById(int id);
    List<Discount> getAllCoupons();
    double getDiscountPriceById(int id);
}
