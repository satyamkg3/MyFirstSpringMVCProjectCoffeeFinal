package com.satyam.service;

import com.satyam.bean.Coffee;

import java.util.List;

public interface CoffeeService {
    Coffee getCoffeeById(int id);
    List<Coffee> getAllCoffee();
    double getCoffeePriceById(int id);
}
