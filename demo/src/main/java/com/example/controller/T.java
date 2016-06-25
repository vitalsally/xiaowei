package com.example.controller;

import java.util.Collections;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.TestMapper;

@Controller
public class T {
	@Autowired
	private TestMapper testMapper;

	@Autowired
	public void g(DataSource dataSource) {
		System.out.println(dataSource);
	}

	@RequestMapping("t")
	@ResponseBody
	public Object f() {
		return Collections.singletonMap("k", "v");
	}

	@RequestMapping("r")
	@ResponseBody
	public Object g() {
		return testMapper.findAll();
	}

}
