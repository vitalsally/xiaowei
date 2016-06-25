package com.tucaocun.timers;

import java.util.UUID;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.tucaocun.entity.Cun;
import com.tucaocun.entity.CunUser;
import com.tucaocun.entity.User;
import com.tucaocun.service.impl.CunServiceImpl;
import com.tucaocun.service.impl.CunUserServiceImpl;
import com.tucaocun.service.impl.UserServiceImpl;
import com.tucaocun.utils.GetBeanFactory;
import com.tucaocun.utils.SpringGetService;
import com.tucaocun.utils.Utils;

public class QuartzJobBeanMain extends QuartzJobBean {
	
	private int timeout;
	private static int i = 0;
	private boolean isRunning = false; 
	private boolean addCun = false; 

	public void setTimeout(int timeout) {
	this.timeout = timeout;
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("定时任务执行第" + ++i + "次调度...");
		if(!isRunning){
			System.out.println("返回");
			return;
		}
	
		UserServiceImpl userServiceImpl = (UserServiceImpl)GetBeanFactory.getSpringEntry("userServiceImpl");
		CunUserServiceImpl cunUserServiceImpl = (CunUserServiceImpl)GetBeanFactory.getSpringEntry("cunUserServiceImpl");
		User user = new User();
		String userId = String.valueOf(Utils.getNewTimeSetId() + Utils.getUUID());
		user.setId(userId);
		System.out.println("添加user开始");
		try {
			userServiceImpl.add(user);
			int i = Utils.rand(1, 4);
			CunUser cunUser = new CunUser();
			cunUser.setCreateTime(Utils.getNewTime());
			cunUser.setId(Utils.getNewTimeSetId() + UUID.randomUUID());
			cunUser.setUserId(userId);
			cunUser.setIsChange(0);
			if(i==1){
				cunUser.setCunId("201605311028303739d8286e4-b36a-4f2e-a9a8-ff03dad416a5");
			}else if(i==2){
				cunUser.setCunId("20160531102840035fbb262ed-cf8a-4509-ae4d-4ee0ba7a87bd");
			}else if(i==3){
				cunUser.setCunId("20160531102850038127efdcd-db57-417f-931c-13388c4b56f7");
			}else{
				cunUser.setCunId("201605311029000347da930f4-0d54-4831-b8c2-75e09f8e9ccb");
			}
			cunUserServiceImpl.addCunUser(cunUser);
			
		} catch (Exception e1) {
			System.err.println("添加user失败");
			e1.printStackTrace();
			return ;
		}
		System.out.println("添加user完成");
		
		
		if(!addCun){
			return;
		}
		Cun cun=new Cun();
		CunServiceImpl cunServiceImpl = (CunServiceImpl)SpringGetService.getSpringEntry("cunServiceImpl");
		String cunId = String.valueOf(Utils.getNewTimeSetId() + Utils.getUUID());
		cun.setId(cunId);
		cun.setCreateBy(userId);
		cun.setCunAlong(userId);
		System.out.println("添加cun开始");
		try {
			cunServiceImpl.addCun(cun);
		} catch (Exception e) {
			System.out.println("添加cun失败");
			e.printStackTrace();
		}
		System.out.println("添加cun完成");
	}
	

}
