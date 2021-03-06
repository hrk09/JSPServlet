package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/queryTest")
public class QueryStringTest extends HttpServlet {

	// GET 방식으로 요청시에만 호출
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Get 방식으로 요청됨</h1>");

		// Parameter 추출
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String colors[] = req.getParameterValues("color");

		out.print("<h1>" + id + ":" + pwd);
		for (String col : colors)
			out.print("<h1>" + col);

		out.close();
	}

	// POST 방식
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Post 방식으로 요청됨</h1>");
		
		//한글변환
		req.setCharacterEncoding("UTF-8"); // 문자열 UTF-8로 인코딩
		
		// Parameter 추출
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String colors[] = req.getParameterValues("color");

		out.print("<h1>" + id + ":" + pwd);
		for (String col : colors)
			out.print("<h1>" + col);

		out.close();
	}

}
