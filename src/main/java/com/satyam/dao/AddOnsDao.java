package com.satyam.dao;

import com.satyam.bean.AddOns;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddOnsDao extends CrudRepository<AddOns,Integer> {

    @Query("from AddOns where addOnID=:addOnID")
    public AddOns getRecordById(@Param("addOnID") int id);
}
