package com.tucaocun.dao;

import com.tucaocun.entity.NewsTucao;

public interface NewsTucaoMapper {
    int deleteByPrimaryKey(String id);

    int insert(NewsTucao record);

    int insertSelective(NewsTucao record);

    NewsTucao selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(NewsTucao record);

    int updateByPrimaryKey(NewsTucao record);
}