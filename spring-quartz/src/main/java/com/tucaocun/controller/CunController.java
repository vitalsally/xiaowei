package com.tucaocun.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tucaocun.entity.Cun;
import com.tucaocun.path.PathContant;
import com.tucaocun.service.CunService;
import com.tucaocun.utils.Utils;
/**
 * Created by Administrator on 2016/5/24.
 */
@Controller
@RequestMapping(PathContant.CUN_V1_CONTROLLER)
public class CunController {
	
	@Resource
    CunService cunService;
    
    @ResponseBody
    @RequestMapping(PathContant.SAVE_CUN)
	public Object addCunAction(Cun cun) throws Exception{
    	String id = String.valueOf(Utils.getNewTimeSetId() + Utils.getUUID());
    	System.out.println(cun.getId());
    	cun.setId(id);
        cunService.addCun(cun);
        Map<String,Object> params =  new HashMap<String,Object>();
        params.put("bean", cunService.selectCunBean(id));
        return params;
    }
}

