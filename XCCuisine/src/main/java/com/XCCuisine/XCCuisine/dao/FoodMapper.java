package com.XCCuisine.XCCuisine.dao;

import com.XCCuisine.XCCuisine.po.Food;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Food food);

    Food selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Food food);
}
