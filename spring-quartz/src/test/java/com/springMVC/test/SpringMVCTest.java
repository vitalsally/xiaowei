package com.springMVC.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tucaocun.entity.NewDetails;
import com.tucaocun.entity.NewsCentontWithBLOBs;
import com.tucaocun.newsutils.NewsUtils;
import com.tucaocun.service.impl.CunUserServiceImpl;
import com.tucaocun.service.impl.NewServiceImpl;
import com.tucaocun.service.impl.NewsDetailsServiceImpl;
import com.tucaocun.utils.GetBeanFactory;
import com.tucaocun.utils.Utils;

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
		
		Map<String, Object> request2 = NewsUtils.getRequest2();
    	JSONArray array = (JSONArray)request2.get("result");
    	for(int i=0;i<array.size();i++){
    		String title = (String)array.get(i);
    		CunUserServiceImpl cunUserServiceImpl = (CunUserServiceImpl)GetBeanFactory.getSpringEntry("cunUserServiceImpl");
    		System.out.println("****");
    		NewServiceImpl newService =(NewServiceImpl) GetBeanFactory.getSpringEntry("newServiceImpl");
    		List<NewsCentontWithBLOBs> selectByTitle = newService.selectByTitle(title);
    		if(selectByTitle.size() > 0){
    			System.out.println(title+": 已存在！");
    			continue;
    		}
    		System.out.println(title+": 存入！");
    		NewsCentontWithBLOBs news= new NewsCentontWithBLOBs();
    		String newsId= Utils.getNewId();
    		news.setId(newsId);
    		news.setCreateTime(Utils.getNewTime());
    		news.setNewsTitle((String)array.get(i));
    		newService.timerAddNewKey(news);
    		NewsDetailsServiceImpl newsDetailsService =(NewsDetailsServiceImpl) GetBeanFactory.getSpringEntry("newsDetailsServiceImpl");
    		Map<String, Object> request1 = NewsUtils.getRequest1(title);
        	JSONArray array2 = (JSONArray)request1.get("result");
        	for (int j = 0; j < array2.size(); j++) {
        		JSONObject jsonObject = (JSONObject) array2.get(j);
        		NewDetails newsDetails = new NewDetails();
        		newsDetails.setId(Utils.getNewId());
        		newsDetails.setNewId(newsId);
        		newsDetails.setCreateTime(Utils.getNewTime());
        		newsDetails.setServiceContent(jsonObject.getString("content"));
        		newsDetails.setServiceFullTitle(jsonObject.getString("full_title"));
        		newsDetails.setServiceImg(jsonObject.getString("img"));
        		newsDetails.setServicePdateSrc(jsonObject.getString("pdate_src"));
        		newsDetails.setServiceImgWidth(jsonObject.getString("img_width"));
        		newsDetails.setServiceSrc(jsonObject.getString("src"));
        		newsDetails.setServicePdate(jsonObject.getString("pdate"));
        		newsDetails.setServiceImgLength(jsonObject.getString("img_length"));
        		newsDetails.setServiceTitle(jsonObject.getString("title"));
        		newsDetails.setServiceUrl(jsonObject.getString("url"));
        		//天假newsDetails
        		newsDetailsService.addNewsDetails(newsDetails);
    		}
    		
    	}
    	
		
		
		
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
