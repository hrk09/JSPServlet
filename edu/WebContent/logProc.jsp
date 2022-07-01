<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	RequestDispatcher rd = request.getRequestDispatcher("exam06.jsp");
	
	if(request.getMethod().equals("POST")){
		//로그인 처리
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//유효성검사
		if(id.isEmpty() || pwd.isEmpty()){ //id, pwd 중 하나라도 되지 않는다면,
			request.setAttribute("msg", "ID 또는 비밀번호를 입력해 주세요'ㅅ'");
			rd.forward(request, response);
			return;
		}
		
		if(session.isNew() || session.getAttribute("id") == null){ //로그인 상태가 아닐 때
			//로그인 처리
			session.setAttribute("id", id);
			out.println("로그인 작업 완료'ㅅ'");
		}else{ //이미 로그인 상태면,
			out.println("현재 로그인 상태입니다'ㅅ'");
		}
		
	} else if (request.getMethod().equals("GET")){
		//로그아웃 처리
		if(session != null && session.getAttribute("id") != null) { //session이  null이 아니고, id가 있다면
			//로그아웃작업 invalidate() 나 removeAttribute() 중에 하나로 처리하면 됨
			//session.invalidate();
			session.removeAttribute("id");
			out.println("로그아웃 작업 완료'ㅅ'");
		}else{ //로그인 상태가 아님
			out.println("현재 로그인 상태가 아닙니다'ㅅ'");
		}
	}
	rd.forward(request, response); //다시 입력페이지로 돌려보냄

%><br>
OK