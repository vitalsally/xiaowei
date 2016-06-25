package com.tucaocun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tucaocun.dao.NewsCentontMapper;
import com.tucaocun.entity.NewsCentontWithBLOBs;
import com.tucaocun.service.NewService;


@Service
public class NewServiceImpl implements NewService{
	
	@Autowired
	NewsCentontMapper newsCentontMapper;

	@Override
	public void timerAddNewKey(NewsCentontWithBLOBs newsCentont) {
		newsCentontMapper.insertSelective(newsCentont);
		
	}

	@Override
	public List<NewsCentontWithBLOBs> selectByTitle(String title) {
		  List<NewsCentontWithBLOBs> selectByTitle = newsCentontMapper.selectByTitle(title);
		return selectByTitle;
	}

}
