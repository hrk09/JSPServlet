package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/test1")
public class Test1 extends HttpServlet{
	//GET ������� ��û�� HttpServlet �� service() �޼ҵ忡 ���� ȣ��Ǵ� �޼ҵ�
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Get ������� ��û��</h1>");
		out.print(req.getRemoteAddr()); //ip �� �޴� �޼ҵ�
		
		out.print("<h1>"+req.getRequestURI()); 
		out.print("<h1>"+req.getRequestURL()); 
		out.print("<h1>"+req.getContextPath()); 
		out.print("<h1>"+req.getServletPath()); 
		out.close();
	}
}
