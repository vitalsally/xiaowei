package com.tucaocun.dao;

import com.tucaocun.entity.HonorPunishment;

public interface HonorPunishmentMapper {
    int deleteByPrimaryKey(String id);

    int insert(HonorPunishment record);

    int insertSelective(HonorPunishment record);

    HonorPunishment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HonorPunishment record);

    int updateByPrimaryKey(HonorPunishment record);
}