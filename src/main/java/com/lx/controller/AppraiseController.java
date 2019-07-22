package com.lx.controller;

import com.lx.pojo.Appraise;
import com.lx.service.AppraiseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppraiseController {

    @Autowired
    AppraiseService appraiseService;
    /**
     * 展示用户热评
     * @return
     */
    @RequestMapping("/showAppraise")
    @ApiOperation(value = "展示用户热评")
    public List<Appraise> showAppraise() {
        List<Appraise> appraiseList =appraiseService.showAppraise();
        return appraiseList;
    }
}
