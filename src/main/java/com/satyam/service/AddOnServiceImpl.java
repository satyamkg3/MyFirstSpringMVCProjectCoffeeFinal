package com.satyam.service;

import com.satyam.bean.AddOns;
import com.satyam.dao.AddOnsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddOnServiceImpl implements AddOnService{

    @Autowired
    private AddOnsDao addOnsDao;

    @Override
    public AddOns getAddOnById(int id) {
        return addOnsDao.getRecordById(id);
    }

    @Override
    public List<AddOns> getAllAddOns() {
        return (List<AddOns>) addOnsDao.findAll();
    }

    @Override
    public double getAddonPriceById(int id) {
        return addOnsDao.getRecordById(id).getPrice();
    }
}
