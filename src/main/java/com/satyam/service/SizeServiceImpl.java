package com.satyam.service;

import com.satyam.bean.Size;
import com.satyam.dao.SizeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SizeServiceImpl implements SizeService{

    @Autowired
    private SizeDao sizeDao;

    @Override
    public Size getSizeById(int id) {
        return sizeDao.getRecordById(id);
    }

    @Override
    public List<Size> getAllSize() {
        return (List<Size>) sizeDao.findAll();
    }

    @Override
    public double getSizePriceById(int id) {
        return sizeDao.getRecordById(id).getPrice();
    }
}
