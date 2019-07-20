package com.lx.controller;

import com.lx.pojo.Food;
import com.lx.service.FoodService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
@CrossOrigin
public class FoodController {

    @Autowired
    FoodService foodService;

    /**
     * 展示所有猫粮狗粮的接口
     * @return
     */
    @RequestMapping("/showAllFood")
    @ApiOperation(value = "展示所有猫粮狗粮的接口")
    public List<Food> showAllFood() {
        List<Food> foodList = foodService.showAllFood();
        return foodList;
    }
}
