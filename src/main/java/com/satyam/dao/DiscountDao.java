package com.satyam.dao;

import com.satyam.bean.Discount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountDao extends CrudRepository<Discount, Integer> {

    @Query("from Discount where couponID=:couponID")
    public Discount getRecordById(@Param("couponID") int id);
}
