package com.edu.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilter2 implements Filter {
	String code;
	
	//Filter 객체 생성시 호출: 초기화 작업
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("init() 호출....2");
		code = fc.getInitParameter("charset");
	}
	
	//매핑한 페이지가 유저로부터 요청이 들어올 때 호출: 필터링 작업
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter() 호출	전....2");
		req.setCharacterEncoding(code); //req 인코딩처리 하고 chain.doFilter 실행
		chain.doFilter(req, resp);
		System.out.println("doFilter() 호출	후....2");
	}
	
	//필터 객체 삭제시 호출: 자원 해제 작업
	public void destroy() {
		
	}
}
