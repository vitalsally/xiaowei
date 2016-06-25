package com.tucaocun.dao;

import java.util.List;

import com.tucaocun.entity.Cun;
import com.tucaocun.entity.CunUser;

public interface CunUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(CunUser record);

    int insertSelective(CunUser record);

    CunUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CunUser record);

    int updateByPrimaryKey(CunUser record);
    
    List<Cun> selectUserOfCunUser();
}