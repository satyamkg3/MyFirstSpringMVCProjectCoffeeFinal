package com.satyam.service;

import com.satyam.bean.AddOns;

import java.util.List;

public interface AddOnService {
    AddOns getAddOnById(int id);
    List<AddOns> getAllAddOns();
    double getAddonPriceById(int id);
}
