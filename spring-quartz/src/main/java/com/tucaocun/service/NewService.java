package com.tucaocun.service;

import java.util.List;

import com.tucaocun.entity.NewsCentontWithBLOBs;

public interface NewService {
	void timerAddNewKey(NewsCentontWithBLOBs newsCentontWithBLOBs);
	List<NewsCentontWithBLOBs> selectByTitle(String title);

}
