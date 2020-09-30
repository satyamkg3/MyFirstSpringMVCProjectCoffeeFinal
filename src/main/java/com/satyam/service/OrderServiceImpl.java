package com.satyam.service;

import com.satyam.bean.*;
import com.satyam.dao.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{

    private double coffeePrice;
    private double addonPrice;
    private double sizePrice;
    private double discountPrice;
    private double bill=0;

    @Autowired
    private EntityManagerFactory entityManagerFactory;
    @Autowired
    private CoffeeService coffeeService;
    @Autowired
    private AddOnService addOnService;
    @Autowired
    private SizeService sizeService;
    @Autowired
    private DiscountService discountService;
    @Autowired
    private OrderDao orderDao;


    @Override
    public double calculateBill(Order order) {

        coffeePrice = coffeeService.getCoffeePriceById(order.getCoffeeID());
        bill += coffeePrice;

        addonPrice = addOnService.getAddonPriceById(order.getAddOnID());
        bill += addonPrice;

        sizePrice = sizeService.getSizePriceById(order.getSizeID());
        bill += sizePrice;

        discountPrice = discountService.getDiscountPriceById(order.getCouponID());
        bill = bill - (bill*discountPrice)/100;

        return bill;
    }

    @Override
    public List getDetails(Order order) {/*
        SessionFactory sessionFactory=entityManagerFactory.unwrap(SessionFactory.class);
        Session session =sessionFactory.openSession();
        Query query=session.createQuery("from Order ");
        List<Order> coffees=query.getResultList();
        //System.out.println(coffees);
        session.close();
        return coffees;
        */
        return null;
    }

    @Override
    public void placeOrder(Order order) {/*
        Coffee coffee = coffeeService.getAllCoffee().get(order.getCoffeeID());
        Size size = sizeService.getAllSize().get(order.getSizeID());
        AddOns addOns = addOnService.getAllAddOns().get(order.getAddonID());
        Discount discount = discountService.getAllCoupons().get(order.getDiscountID());
        */
        List<Order> orderList = (List<Order>) orderDao.findAll();
        int max =0;
        for(Order order1: orderList)
        {
            max = order1.getOrderID();
        }
        order.setOrderID(++max);
        orderDao.save(order);
    }
}
