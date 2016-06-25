package com.tucaocun.dao;

import com.tucaocun.entity.WeiCentont;

public interface WeiCentontMapper {
    int deleteByPrimaryKey(String id);

    int insert(WeiCentont record);

    int insertSelective(WeiCentont record);

    WeiCentont selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WeiCentont record);

    int updateByPrimaryKeyWithBLOBs(WeiCentont record);

    int updateByPrimaryKey(WeiCentont record);
}