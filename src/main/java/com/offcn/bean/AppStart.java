package com.offcn.bean;

import java.io.IOException;





import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {
	
	//++++++++++++++++++++++++++
//你个二傻子
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		context.start();
		
		//ÈÃÖ÷Ïß³Ì×èÈû
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
