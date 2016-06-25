package com.tucaocun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tucaocun.dao.NewDetailsMapper;
import com.tucaocun.entity.NewDetails;
import com.tucaocun.service.NewsDetailsService;

@Service
public class NewsDetailsServiceImpl implements NewsDetailsService {
	
	@Autowired
	NewDetailsMapper newDetailsMapper;

	@Override
	public void addNewsDetails(NewDetails newDetails) {
		newDetailsMapper.insertSelective(newDetails);

	}

}
