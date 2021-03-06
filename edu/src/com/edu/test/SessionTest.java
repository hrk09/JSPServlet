package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/sessionTest")
public class SessionTest extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String param = req.getParameter("p");
		
		System.out.println(param);  //param 없이 서버 실행하면 null 값이 뜸
		HttpSession session = null;
		String msg = null;
		
		if(param.equals("create")) { //param 안에 create라는 게 있다면
			session = req.getSession();
			if(session.isNew()) {
				msg = "새로운 세션객체가 생성되었습니다.";
			} else {
				msg = "기존 세션 객체가 리턴되었습니다.";
			}
		}else if(param.equals("delete")) { //세션객체 삭제작업
 			session = req.getSession(false);
 			if(session != null){ //session이 존재한다면
 				session.invalidate(); //세션객체삭제시킨다
 				msg = "세션 객체가 삭제되었습니다.";
 			}else 
 				msg = "세션이 존재하지 않습니다.";
		}else if(param.equals("add")){ //세션객체 등록작업
			session = req.getSession();
			session.setAttribute("data1", "첫번째 데이터");
			msg = "세션 데이터 등록!";
		}else if(param.equals("get")){ //세션에 등록된 데이터 추출하는 작업
			session = req.getSession(false);
			if(session != null){
				msg = (String)session.getAttribute("data1");
			}
		}else if(param.equals("rem")){ //세션에 등록된 데이터 삭제 작업 
			session = req.getSession(false);
			if(session != null){
				session.removeAttribute("data1");
				msg = "세션 데이터 삭제작업 완료!";
			}
		}else if(param.equals("rep")){ //세션객체 등록작업2
			session = req.getSession();
			session.setAttribute("data1", "두번째 데이터");//data1에 똑같은 이름으로 setAttribute 하면 덮어쓰기된다.
			msg = "두번째 세션 데이터 등록!";
		}
		
		out.print("<h1>" + msg);
		out.close();
	}}
