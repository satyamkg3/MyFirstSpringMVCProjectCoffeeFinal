package com.satyam.dao;

import com.satyam.bean.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends CrudRepository<Order,Integer> {
}
