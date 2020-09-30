package com.satyam.dao;

import com.satyam.bean.Size;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeDao extends CrudRepository<Size, Integer> {

    @Query("from Size where sizeID=:sizeID")
    public Size getRecordById(@Param("sizeID") int id);
}
