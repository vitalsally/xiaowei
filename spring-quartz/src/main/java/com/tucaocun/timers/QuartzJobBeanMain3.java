package com.tucaocun.timers;

import java.util.List;
import java.util.Map;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

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

@Component
@EnableScheduling
public class QuartzJobBeanMain3 {

	@Scheduled(cron = "* * 2 * * ?")
	public void hehe() throws Exception {
		System.out.println("QuartzJobBeanMain3******Get News Details******");
		
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

	}
	}
