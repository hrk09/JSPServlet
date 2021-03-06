package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/bookOutput")
public class BookTest2 extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book book = (Book)req.getAttribute("book");
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Book 정보</h1>");
		out.print("<h3> title: " + book.getTitle());
		out.print("<h3> author: " + book.getAuthor());
		out.print("<h3> publisher: " + book.getPublisher());
		
		out.close();
	}
}
