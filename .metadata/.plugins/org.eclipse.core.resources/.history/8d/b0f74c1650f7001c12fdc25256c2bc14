package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/cookie1")
public class Cookie1 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Cookie 전송!</h1>");
		
		//생성, 수정, 삭제 -> cookie 생성
		Cookie c1 = new Cookie("id", "guest");
		//cookie 전송
		resp.addCookie(c1);
		
		Cookie c2 = new Cookie("code", "1004");
		//Cookie 유효시간 설정(초)
		c2.setMaxAge(60*60*3); //3시간
		resp.addCookie(c2);

		Cookie c3 = new Cookie("subject", "java");
		c3.setMaxAge(60*60*24*10); //10일
		resp.addCookie(c3);
		
		out.close();
	}
}
