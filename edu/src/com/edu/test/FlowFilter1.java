package com.edu.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilter1 implements Filter {
	
	//Filter 객체 생성시 호출: 초기화 작업 = 서버시작시(web.xml에서 filter 태그 읽을 때)
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("init() 호출....1");
	}
	
	//매핑한 페이지가 유저로부터 요청이 들어올 때 호출: 필터링 작업
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter() 호출	전....1");
		//서블릿 수행 전에 수행할 코드
		chain.doFilter(req, resp);
		//서블릿 수행 후에 수행할 코드
		System.out.println("doFilter() 호출	후....1");
	}
	
	//필터 객체 삭제시 호출: 자원 해제 작업 = 서버중지 시
	public void destroy() {
		
	}
}
