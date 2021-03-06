package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/dispatcher1")
public class RequestDispatcherTest1 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Page 1</h1>");
		
		//RequestDispatcher 객체생성
		RequestDispatcher rd = req.getRequestDispatcher("dispatcher2"); //dispatcher2로 경로 이동하기(상대경로)
		
		//page 이동
		//rd.forward(req, resp);  //서버 출력해보면, page2만 나옴
		rd.include(req, resp);	  //서버 출력시, page1 + page2
		
		
		out.close();
	}
}
