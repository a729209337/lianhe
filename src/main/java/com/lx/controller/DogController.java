package com.lx.controller;

import com.lx.pojo.Dog;
import com.lx.service.DogService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {

    @Autowired
    DogService dogService;

    /**
     * 展示所有狗狗接口
     * @return
     */
    @RequestMapping("/showDogList")
    @ApiOperation(value = "展示所有的狗狗接口")
    public List<Dog> showDogList() {
        List<Dog> dogList = dogService.showDogList();
        return dogList;
    }
}
