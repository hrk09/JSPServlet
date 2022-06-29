package com.edu.test; //FirstServlet은 com.edu.test 경로 안에 있음

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*; // HttpServlet 쓰려면 패키지 import해야함

@WebServlet("/second") //어노테이션 방식
public class SecondServlet extends HttpServlet{ // 서블릿 쓸 때 extends HttpServlet에서 상속받아야 한다.	

	@Override
		public void init(ServletConfig config) throws ServletException {
		// 최초에 1번 호출됨 -> 초기화 작업
		System.out.println("Second Init() 호출!");
		}
	
	@Override
	public void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// 서비스 구현
		System.out.println("Second Service() 호출!");
	}
	
	
	
}
