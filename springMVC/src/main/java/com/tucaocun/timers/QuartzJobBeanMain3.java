package com.tucaocun.timers;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tucaocun.service.impl.CunUserServiceImpl;
import com.tucaocun.utils.GetBeanFactory;

@Component
@EnableScheduling
public class QuartzJobBeanMain3 {

	@Scheduled(cron = "0/60 * * * * ?")
	public void hehe() {
		System.out.println("QuartzJobBeanMain3*********************");
//		CunUserServiceImpl cunUserServiceImpl = (CunUserServiceImpl)GetBeanFactory.getSpringEntry("cunUserServiceImpl");
//		cunUserServiceImpl.selectUserNumOfCunUser();
		
	}

}
