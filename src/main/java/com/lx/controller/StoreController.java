package com.lx.controller;

import com.lx.pojo.Pet;
import com.lx.service.StoreService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
@CrossOrigin
public class StoreController {

    @Autowired
    StoreService storeService;

    /**
     * 通过商店ID，查询到对应的宠物
     * @param storeId
     * @return
     */
    @RequestMapping("/showStore")
    @ApiOperation(value = "通过商店ID查询对应的所有宠物")
    public List<Pet> findByStoreId(int storeId) {
        return storeService.findByStoreId(storeId);
    }
}
