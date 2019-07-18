package com.lx.controller;

import com.lx.pojo.Cat;
import com.lx.service.CatService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cat")
public class CatController {

    @Autowired
    CatService catService;

    /**
     * 展示所有狗狗接口
     * @return
     */
    @RequestMapping("/showCatList")
    @ApiOperation(value = "展示所有的猫接口")
    public List<Cat> showcatList() {
        List<Cat> catList = catService.showCatList();
        return catList;
    }
}
