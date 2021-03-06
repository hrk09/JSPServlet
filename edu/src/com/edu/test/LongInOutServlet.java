package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/logProc")

public class LongInOutServlet extends HttpServlet{
	//로그인 요청 서비스 메소드	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//1. parameter 추출
		String id = req.getParameter("id"); //name 대소문자 주의
		String pwd = req.getParameter("pwd"); 
		
		//2. 유효성검사
		if(id.isEmpty() || pwd.isEmpty()){ //id or pwd가 비어있으면
			System.out.println("id 또는  pwd를 입력해주세요.");
			return; //현재 실행중인 메소드 종료
		}
		
		//3. DB check
		
		//4. 로그인 상태 여부 검사
		HttpSession session = req.getSession();
		if(session.isNew() || session.getAttribute("id") == null){ //로그인 상태가 아닐 때
			//5. 로그인 처리
			session.setAttribute("id", id);
			System.out.println("로그인 작업 완료!");
		}else{ //이미 로그인 상태면,
			System.out.println("현재 로그인 상태입니다.");
		}

	}
	
	//로그아웃 서비스 메소드
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null && session.getAttribute("id") != null) { //session이  null이 아니고, id가 있다면
			//로그아웃작업 invalidate() 나 removeAttribute() 중에 하나로 처리하면 됨
			//session.invalidate();
			session.removeAttribute("id");
			System.out.println("로그아웃 작업 완료!");
		}else{ //로그인 상태가 아님
			System.out.println("현재 로그인 상태가 아닙니다.");
		}
		
	}
}
