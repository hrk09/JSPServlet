package com.edu.test;

import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/test2")
public class Test2 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Get 방식으로 전송됨</h1>");
		
		out.print("<h2>" + req.getMethod());
		out.print("<h2>" + req.getContentLength()); //결과값 : -1; 전송받은 데이터 자체가 없을 때 -1, null 로 표현됨
		out.print("<h2>" + req.getContentType());   //결과값 : null; 전송받은 데이터 자체가 없을 때 -1, null 로 표현됨
		out.print("<h2>" + req.getQueryString());	//결과값 : null;
		
		
		Enumeration<String> em = req.getHeaderNames();
		while(em.hasMoreElements()) {
			String s = em.nextElement();
			out.print("<h3>" + s + ":" + req.getHeader(s));
		}
		
		out.close();
	}
}
