package com.lx.service.impl;

import com.lx.mapper.FoodMapper;
import com.lx.pojo.Food;
import com.lx.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodMapper foodMapper;

    @Override
    public List<Food> showAllFood() {
        List<Food> foodList = foodMapper.showAllFood();
        return foodList;
    }
}
