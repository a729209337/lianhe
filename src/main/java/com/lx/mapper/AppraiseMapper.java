package com.lx.mapper;

import com.lx.pojo.Appraise;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppraiseMapper {
    List<Appraise> showAppraise();
}
