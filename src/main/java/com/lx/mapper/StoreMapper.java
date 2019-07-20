package com.lx.mapper;

import com.lx.pojo.Pet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StoreMapper {
    List<Pet> findByStoreId(int storyId);
}
