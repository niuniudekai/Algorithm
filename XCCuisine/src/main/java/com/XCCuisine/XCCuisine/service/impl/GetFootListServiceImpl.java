package com.XCCuisine.XCCuisine.service.impl;

import com.XCCuisine.XCCuisine.dao.FoodMapper;
import com.XCCuisine.XCCuisine.po.Food;
import com.XCCuisine.XCCuisine.service.IGetFootListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class GetFootListServiceImpl implements IGetFootListService {
    @Resource
    FoodMapper foodMapper;
    @Override
    public List<Food> getFootListService() {
        List<Food> result = new ArrayList<>();

        result.add(foodMapper.selectByPrimaryKey(1));
        result.add(foodMapper.selectByPrimaryKey(2));

        return result;
    }
}
