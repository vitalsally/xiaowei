package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.Table1;

@Mapper
public interface TestMapper {
	List<Table1> findAll();
}
