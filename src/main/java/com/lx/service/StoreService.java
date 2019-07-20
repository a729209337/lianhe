package com.lx.service;

import com.lx.pojo.Pet;

import java.util.List;

public interface StoreService {
    List<Pet> findByStoreId(int storyId);
}
