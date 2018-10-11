package com.offcn.bean;

import java.util.Date;

public class HelloJob {
	
	public void run(){
		System.out.println("这是一个作业:"+new Date().toLocaleString());
	}


}
