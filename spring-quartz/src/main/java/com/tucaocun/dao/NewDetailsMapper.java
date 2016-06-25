package com.tucaocun.dao;

import com.tucaocun.entity.NewDetails;

public interface NewDetailsMapper {
    int deleteByPrimaryKey(String id);

    int insert(NewDetails record);

    int insertSelective(NewDetails record);

    NewDetails selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(NewDetails record);

    int updateByPrimaryKey(NewDetails record);
}