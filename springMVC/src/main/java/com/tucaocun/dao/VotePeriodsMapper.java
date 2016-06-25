package com.tucaocun.dao;

import com.tucaocun.entity.VotePeriods;

public interface VotePeriodsMapper {
    int deleteByPrimaryKey(String id);

    int insert(VotePeriods record);

    int insertSelective(VotePeriods record);

    VotePeriods selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(VotePeriods record);

    int updateByPrimaryKeyWithBLOBs(VotePeriods record);

    int updateByPrimaryKey(VotePeriods record);
}