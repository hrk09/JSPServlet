package com.edu.test; //FirstServlet�� com.edu.test ��� �ȿ� ����

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*; // HttpServlet ������ ��Ű�� import�ؾ���

public class FirstServlet extends HttpServlet{ // ������ �� �� extends HttpServlet���� ��ӹ޾ƾ� �Ѵ�.	

	@Override
		public void init(ServletConfig config) throws ServletException {
		// ���ʿ� 1�� ȣ��� -> �ʱ�ȭ �۾�
		System.out.println("Init() ȣ��!");
		}
	
	@Override
	public void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// ���� ����
		System.out.println("Service() ȣ��!");
	}
	
	
	
}