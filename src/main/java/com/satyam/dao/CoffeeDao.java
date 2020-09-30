package com.satyam.dao;

import com.satyam.bean.Coffee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeDao extends CrudRepository<Coffee, Integer> {
    @Query("from Coffee where coffeeID=:coffeeID")
    Coffee getRecordById(@Param("coffeeID") int id);

}
