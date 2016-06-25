package com.tucaocun.dao;

import com.tucaocun.entity.WeiTucao;

public interface WeiTucaoMapper {
    int deleteByPrimaryKey(String id);

    int insert(WeiTucao record);

    int insertSelective(WeiTucao record);

    WeiTucao selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WeiTucao record);

    int updateByPrimaryKey(WeiTucao record);
}