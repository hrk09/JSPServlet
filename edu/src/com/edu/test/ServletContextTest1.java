package com.edu.test;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/context")
public class ServletContextTest1 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Get 방식으로 요청됨</h1>");
		
		//ServletContext 추출
		ServletContext sc = this.getServletContext();
		//서버정보 추출
		out.print("<h1>" + sc.getMajorVersion()+"." + sc.getMinorVersion());
		out.print("<h1>" + sc.getServerInfo());
		out.print("<h1>" + sc.getInitParameter("config"));
		
		ShareObject obj1 = new ShareObject();
		obj1.setCount(100);
		obj1.setStr("메시지1");
		
		ShareObject obj2 = new ShareObject();
		obj2.setCount(500);
		obj2.setStr("메시지2");
		
		// ServletContext에 공유데이터 등록 
		sc.setAttribute("data1", obj1);
		sc.setAttribute("data2", obj2);
		
		
		out.close();
	}
}
