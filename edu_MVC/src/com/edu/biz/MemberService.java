package com.edu.biz;

import com.edu.beans.Member;
import com.edu.dao.MemberDAO;

//회원 서비스 객체
public class MemberService {

	MemberDAO dao = new MemberDAO();
	
	//회원가입
	public void memberInsert(Member member){
		
		dao.insertMember(member);
		
	}
	
}
