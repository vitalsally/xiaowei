package com.springMVC.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tucaocun.service.impl.CunUserServiceImpl;
import com.tucaocun.utils.GetBeanFactory;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class SpringMVCTest {
	
	
/*	CunServiceImpl cunServiceImpl;
	public CunServiceImpl getCunServiceImpl() {
		return cunServiceImpl;
	}
	@Autowired
	public void setCunServiceImpl(CunServiceImpl cunServiceImpl) {
		this.cunServiceImpl = cunServiceImpl;
	}*/


	@Test
	public void testName() throws Exception {
		
//		Cun cun = new Cun();
//		cun.setId("201605311028303739d8286e4-b36a-4f2e-a9a8-ff03dad416a5");
//		cun.setUserNum(51);
//		CunServiceImpl cunServiceImpl =  (CunServiceImpl)GetBeanFactory.getSpringEntry("cunServiceImpl");
//		cunServiceImpl.updateCun(cun);
//		CunUserServiceImpl cunUserServiceImpl = (CunUserServiceImpl)GetBeanFactory.getSpringEntry("cunUserServiceImpl");
//		cunUserServiceImpl.selectUserNumOfCunUser();
		
		
//		Cun cun=new Cun();
//		String id = String.valueOf(Utils.getNewTimeSetId() + Utils.getUUID());
//		cun.setId(id);
////		cunServiceImpl.addCun(cun);
//		System.out.println("11111111111");
////		CunMapper springEntry = (CunMapper)SpringGetService.getSpringEntry("cunMapper");
////		springEntry.selectByPrimaryKey("1");
//		System.out.println(SpringGetService.getSpringEntry("cunServiceImpl").getClass());;
//		CunServiceImpl cunServiceImpl1 = (CunServiceImpl)GetBeanFactory.getSpringEntry("cunServiceImpl");
//		String id1 = String.valueOf(Utils.getNewTimeSetId() + Utils.getUUID());
//		cun.setId(id1);
//		cunServiceImpl1.addCun(cun);
//		CunServiceImpl cunServiceImpl = 
//				(CunServiceImpl)SpringGetService.getSpringEntry("cunService",CunServiceImpl.class);
//		cunServiceImpl.addCun(cun);
//		cunServiceImpl.selectCunBean("1");
	}
}
