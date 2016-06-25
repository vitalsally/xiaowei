package com.tucaocun.dao;

import com.tucaocun.entity.Position;

public interface PositionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}