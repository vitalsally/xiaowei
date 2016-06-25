package com.tucaocun.service;

import com.tucaocun.entity.Cun;
import com.tucaocun.entity.CunUser;

public interface CunUserService {

	void addCunUser(CunUser cunUser);
	Integer selectUserNumOfCunUser();
}
