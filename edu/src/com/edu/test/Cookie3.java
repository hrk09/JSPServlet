package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/cookie3")
public class Cookie3 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cnt = 0;
		
		Cookie[] list = req.getCookies();
		for (int i = 0; list != null && i < list.length; i++) {
			if(list[i].getName().equals("count")){ //읽어들인 쿠키 이름에서 cnt랑 같은거 찾아내는 것
				cnt = Integer.parseInt(list[i].getValue());
			}
		}
		cnt++;
		
		Cookie c = new Cookie("count", cnt+"");
		c.setMaxAge(60*60*24*10);
		resp.addCookie(c);
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>방문횟수 : " + cnt);
		
	
		out.close();
	}
}
