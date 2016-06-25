package com.tucaocun.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.ws.rs.BeanParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tucaocun.entity.Cun;
import com.tucaocun.service.CunService;
import com.tucaocun.utils.Utils;
/**
 * Created by Administrator on 2016/5/24.
 */
@Controller
@RequestMapping("/v1/cun")
public class CunController {
	
    CunService cunService;
    
    @ResponseBody
    @RequestMapping("/save")
	public Object addCunAction(@BeanParam Cun cun) throws Exception{
    	System.err.println("**************************");
    	String id = String.valueOf(Utils.getNewTimeSetId() + Utils.getUUID());
    	cun.setId(id);
    	Random rand = new Random();
    	String cunCall = Utils.getChinese((long)(rand.nextInt(999)))+Utils.getChinese((long)(rand.nextInt(999)))+Utils.getChinese((long)(rand.nextInt(999)))+Utils.getChinese((long)(rand.nextInt(999)));
    	cun.setCunCall(cunCall);
    	String cunName = Utils.getChinese((long)(rand.nextInt(999)))+Utils.getChinese((long)(rand.nextInt(999)));
    	cun.setCunName(cunName);
    	System.err.println(cun.toString());
        cunService.addCun(cun);
        Map<String,Object> params =  new HashMap<String,Object>();
        params.put("bean", cunService.selectCunBean(id));
        return params;
    }
    public static void main(String[] args) throws Exception {
    	CunController cunAction = new CunController();
        Cun cun  = new Cun();
        cunAction.addCunAction(cun);
    }
	public CunService getCunService() {
		return cunService;
	}
	@Autowired
	public void setCunService(CunService cunService) {
		this.cunService = cunService;
	}
    
}
