package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet("/third")
public class ThirdServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Third!");
		
		resp.setContentType("text/html;charset=UTF-8"); //content type �����ϴ� �۾�. ��½�Ʈ�� �ޱ� ���� �����������!!
		
		PrintWriter out = resp.getWriter(); //�ܺ� ������ �о���� �۾�
		out.print("<h1>Have a nice day!</h1>"); //body�� ������ ������ �۾�
		out.print("<h1>��ſ� ���� ��������~</h1>");
		out.close(); //���� �׸� �ް��� �ݴ� �۾�
	}
}
