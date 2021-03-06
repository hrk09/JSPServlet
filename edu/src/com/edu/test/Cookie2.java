package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.sun.corba.se.impl.ior.GenericTaggedComponent;


@WebServlet("/cookie2")
public class Cookie2 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Cookie 추출!</h1>");
		
		Cookie[] list = req.getCookies();
		for (int i = 0; i < list.length; i++) {
			Cookie c = list[i];
			out.print("<h1>" + c.getName() + ":" + c.getValue());
		}
		
		out.close();
	}
}
