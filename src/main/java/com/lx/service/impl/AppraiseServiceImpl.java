package com.lx.service.impl;

import com.lx.mapper.AppraiseMapper;
import com.lx.pojo.Appraise;
import com.lx.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppraiseServiceImpl implements AppraiseService {
    @Autowired
    AppraiseMapper appraiseMapper;
    @Override
    public List<Appraise> showAppraise() {
        return appraiseMapper.showAppraise();
    }
}
