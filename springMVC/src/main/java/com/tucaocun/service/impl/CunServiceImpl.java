package com.tucaocun.service.impl;

import com.tucaocun.dao.CunMapper;
import com.tucaocun.entity.Cun;
import com.tucaocun.service.CunService;
import com.tucaocun.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/5/24.
 */
@Service 
public class CunServiceImpl implements CunService{

    CunMapper cunMapper;
    

    public CunMapper getCunMapper() {
		return cunMapper;
	}


    @Autowired
	public void setCunMapper(CunMapper cunMapper) {
		this.cunMapper = cunMapper;
	}


	public void addCun(Cun cun) throws Exception {
		cun.setCreateTime(Utils.getNewTime());
		cun.setIsChange(0);
    	cun.setCunCall(Utils.getChinese().toString());
    	cun.setCunName(Utils.getChinese().toString());
        cunMapper.insertSelective(cun);
    }

	public Cun selectCunBean(String id) {
		return cunMapper.selectByPrimaryKey(id);
	}


	@Override
	public Integer updateCun(Cun cun) {
		return cunMapper.updateByPrimaryKeySelective(cun);
	}
}
