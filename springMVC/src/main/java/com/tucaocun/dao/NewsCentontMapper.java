package com.tucaocun.dao;

import com.tucaocun.entity.NewsCentont;
import com.tucaocun.entity.NewsCentontWithBLOBs;

public interface NewsCentontMapper {
    int deleteByPrimaryKey(String id);

    int insert(NewsCentontWithBLOBs record);

    int insertSelective(NewsCentontWithBLOBs record);

    NewsCentontWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(NewsCentontWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsCentontWithBLOBs record);

    int updateByPrimaryKey(NewsCentont record);
}