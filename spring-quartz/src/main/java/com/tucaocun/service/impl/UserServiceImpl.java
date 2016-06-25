package com.tucaocun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tucaocun.dao.UserMapper;
import com.tucaocun.entity.User;
import com.tucaocun.service.UserService;
import com.tucaocun.utils.Utils;


@Service
public class UserServiceImpl implements UserService {
	
	private UserMapper userMapper;

	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	@Override
	public void add(User user) throws Exception {
		user.setName(Utils.getCharAndNumr(6));
		user.setPwd("111111");
		user.setIdCard(Utils.randomIDCard());
		user.setRealName(Utils.getChinese().toString());
		user.setLv(String.valueOf(Utils.rand(1, 20)));
		user.setHavaVote(1);
		user.setPunishmentVote(1);
		user.setZhifubao("130" + Utils.rand(10000000, 99999999));
		user.setIsDel(0);
		user.setIsLimit(0);
		user.setRegisterTime(Utils.getNewTime());
		user.setActiveDegree(Utils.rand(1, 10));
		userMapper.insert(user);

	}

}
