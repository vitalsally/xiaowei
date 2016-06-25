package com.tucaocun.dao;

import com.tucaocun.entity.CunUser;

public interface CunUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(CunUser record);

    int insertSelective(CunUser record);

    CunUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CunUser record);

    int updateByPrimaryKey(CunUser record);
}