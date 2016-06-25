package com.tucaocun.dao;

import com.tucaocun.entity.NewHospital;
import com.tucaocun.entity.NewHospitalWithBLOBs;

public interface NewHospitalMapper {
    int deleteByPrimaryKey(String id);

    int insert(NewHospitalWithBLOBs record);

    int insertSelective(NewHospitalWithBLOBs record);

    NewHospitalWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(NewHospitalWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewHospitalWithBLOBs record);

    int updateByPrimaryKey(NewHospital record);
}