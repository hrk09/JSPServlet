package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/context2")
public class ServletContextTest2 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Get 방식으로 요청됨</h1>");
		
		ServletContext sc = this.getServletContext();
		ShareObject d1 = (ShareObject)sc.getAttribute("data1");
		ShareObject d2 = (ShareObject)sc.getAttribute("data2");
		
		out.print("<h1>" + d1.getCount() + ":" +	d1.getStr());
		out.print("<h1>" + d2.getCount() + ":" +	d2.getStr());
		
		out.close();
	}
}
