package com.satyam.service;

import com.satyam.bean.Coffee;
import com.satyam.dao.CoffeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService{

    @Autowired
    private CoffeeDao coffeeDao;

    @Override
    public Coffee getCoffeeById(int id) {
        return coffeeDao.getRecordById(id);
    }

    @Override
    public List<Coffee> getAllCoffee() {
        return (List<Coffee>) coffeeDao.findAll();
    }

    @Override
    public double getCoffeePriceById(int id) {
        return coffeeDao.getRecordById(id).getPrice();
    }
}
