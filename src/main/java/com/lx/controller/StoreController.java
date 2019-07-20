package com.lx.controller;

import com.lx.pojo.Pet;
import com.lx.service.StoreService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @RequestMapping("/showStore")
    @ApiOperation(value = "通过商店ID查询对应的所有宠物")
    public List<Pet> findByStoreId(int storyId) {
        return storeService.findByStoreId(storyId);
    }
}
