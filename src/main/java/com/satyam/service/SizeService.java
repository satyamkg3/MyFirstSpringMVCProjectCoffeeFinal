package com.satyam.service;

import com.satyam.bean.Size;

import java.util.List;

public interface SizeService {
    Size getSizeById(int id);
    List<Size> getAllSize();
    double getSizePriceById(int id);
}
