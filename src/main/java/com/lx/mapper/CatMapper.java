package com.lx.mapper;


import com.lx.pojo.Cat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CatMapper {
    List<Cat> showCatList();
}
