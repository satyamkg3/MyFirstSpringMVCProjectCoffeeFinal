package com.satyam.service;

import com.satyam.bean.Discount;
import com.satyam.dao.DiscountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountDao discountDao;
    @Override
    public Discount getCouponById(int id) {
        return discountDao.getRecordById(id);
    }

    @Override
    public List<Discount> getAllCoupons() {
        return (List<Discount>) discountDao.findAll();
    }

    @Override
    public double getDiscountPriceById(int id) {
        return discountDao.getRecordById(id).getPercentage();
    }
}
