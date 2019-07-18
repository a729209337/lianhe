package com.lx.service.impl;

import com.lx.mapper.CatMapper;
import com.lx.pojo.Cat;
import com.lx.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CatServiceImpl implements CatService {

    @Autowired
    CatMapper catMapper;

    @Override
    public List<Cat> showCatList() {
        List<Cat> catList = catMapper.showCatList();
        return catList;
    }
}
