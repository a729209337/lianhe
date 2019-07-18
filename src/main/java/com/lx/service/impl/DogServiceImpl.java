package com.lx.service.impl;

import com.lx.mapper.DogMapper;
import com.lx.pojo.Dog;
import com.lx.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogMapper dogMapper;

    @Override
    public List<Dog> showDogList() {
        List<Dog> dogList = dogMapper.showDogList();
        return dogList;
    }
}
