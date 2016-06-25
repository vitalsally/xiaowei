package com.tucaocun.dao;

import com.tucaocun.entity.Cun;

public interface CunMapper {
    int deleteByPrimaryKey(String id);

    int insert(Cun record);

    int insertSelective(Cun record);

    Cun selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Cun record);

    int updateByPrimaryKey(Cun record);
}