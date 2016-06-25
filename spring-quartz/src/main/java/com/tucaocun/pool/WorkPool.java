package com.tucaocun.pool;


public class WorkPool implements Runnable{
	private String a;
	private String b;	
	
	
	@Override
	public void run() {
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	

	public WorkPool(String a, String b) {
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
