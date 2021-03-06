package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import jdk.nashorn.internal.ir.RuntimeNode.Request;


@WebServlet("/bookReg")
public class BookTest1 extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//body 내 한글처리
		//req.setCharacterEncoding("utf-8");
		
		//1. client가 넘겨준  parameter 추출
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		String publisher = req.getParameter("publisher");
		
		//2. VO 생성 및 데이터 바인딩
		Book b = new Book();	
		b.setTitle(title);
		b.setAuthor(author);
		b.setPublisher(publisher);
		
		//3. Request에 데이터 등록
		req.setAttribute("book", b);
		
		//유효성검사
		if(title.isEmpty() || author.isEmpty() || publisher.isEmpty()) {
			RequestDispatcher rd = req.getRequestDispatcher("exam08.jsp");
			rd.forward(req, resp);
			return;
		}
		
		//4. 페이지 이동
		RequestDispatcher rd = req.getRequestDispatcher("bookOutput.jsp");
		rd.forward(req, resp);
	}
}
