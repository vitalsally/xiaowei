package com.tucaocun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tucaocun.dao.CunMapper;
import com.tucaocun.dao.CunUserMapper;
import com.tucaocun.entity.Cun;
import com.tucaocun.entity.CunUser;
import com.tucaocun.service.CunUserService;


@Service
public class CunUserServiceImpl implements CunUserService {
	
	private CunUserMapper cunUserMapper;
	private CunMapper cunMapper;
	
	private CunServiceImpl cunServiceImpl;
	
	
	
	public CunServiceImpl getCunServiceImpl() {
		return cunServiceImpl;
	}
	@Autowired
	public void setCunServiceImpl(CunServiceImpl cunServiceImpl) {
		this.cunServiceImpl = cunServiceImpl;
	}
	public CunMapper getCunMapper() {
		return cunMapper;
	}
	@Autowired
	public void setCunMapper(CunMapper cunMapper) {
		this.cunMapper = cunMapper;
	}
	public CunUserMapper getCunUserMapper() {
		return cunUserMapper;
	}
	@Autowired
	public void setCunUserMapper(CunUserMapper cunUserMapper) {
		this.cunUserMapper = cunUserMapper;
	}


	@Override
	public void addCunUser(CunUser cunUser) {
		cunUserMapper.insert(cunUser);

	}
	@Override
	public Integer selectUserNumOfCunUser() {
		List<Cun> selectUserOfCunUser = cunUserMapper.selectUserOfCunUser();
		for (Cun cun : selectUserOfCunUser) {
			System.out.println(cun.toString());
			cunServiceImpl.updateCun(cun);
		}
		
		return null;
	}

}
