package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/test4")
public class Test4 extends HttpServlet{
	
	int cnt = 0; //멤버변수. 증가됨
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//int cnt = 0; //지역변수. 증가안됨
		this.cnt++;
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+ cnt);
		out.close();
	}
}
