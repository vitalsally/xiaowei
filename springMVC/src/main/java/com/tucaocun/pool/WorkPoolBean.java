package com.tucaocun.pool;

import java.util.concurrent.Callable;

import com.tucaocun.entity.Cun;

public class WorkPoolBean implements Callable<Cun>{
	
	String a;
	String b;

	@Override
	public Cun call() throws Exception {
	System.out.println(a);
	System.out.println(b);
		return null;
	}

	
	public WorkPoolBean(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}


	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
	
	

}
