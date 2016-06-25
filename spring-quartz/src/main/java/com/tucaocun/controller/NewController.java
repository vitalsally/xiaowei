package com.tucaocun.controller;

import javax.annotation.Resource;
import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tucaocun.entity.Cun;
import com.tucaocun.path.PathContant;
import com.tucaocun.service.NewService;

@Controller
@RequestMapping(PathContant.NEW_V1_CONTROLLER)
public class NewController {
	
	@Resource
    NewService cunService;
    
    @ResponseBody
    @RequestMapping(PathContant.SAVE_CUN)
	public Object addCunAction(Cun cun) throws Exception{
        return null;
    }

}
