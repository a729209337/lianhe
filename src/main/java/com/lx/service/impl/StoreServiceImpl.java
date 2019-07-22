package com.lx.service.impl;

import com.lx.mapper.StoreMapper;
import com.lx.pojo.Pet;
import com.lx.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreMapper storeMapper;
    @Override
    public List<Pet> findByStoreId(int storeId) {
        return storeMapper.findByStoreId(storeId);
    }
}
