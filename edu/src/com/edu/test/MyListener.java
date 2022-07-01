package com.edu.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{
	
	public MyListener() {
		System.out.println("MyListener 객제 생성!");
	}
	
	//ServletContext 객체 생성시 호출 = 서버 시작시
	public void contextInitialized(ServletContextEvent arg0) {
		//서비스 제공 전 준비해야할 로직 구현
		System.out.println("ServletContext 객체 생성!");
		
	}
	
	//ServletContextListener 객체 삭제시 호출 = 서버 중지시 
	public void contextDestroyed(ServletContextEvent arg0) {
	}
}
