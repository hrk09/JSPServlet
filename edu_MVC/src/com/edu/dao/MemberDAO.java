package com.edu.dao;

import java.sql.*;

import com.edu.beans.Member;

// DB의 Member 테이블 처리 객체(회원 데이터 처리 목적)
public class MemberDAO {

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "admin123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void insertMember(Member member) {
		try {
			
			// 소스를 완성하세요
			Connection conn = this.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("insert into member values(?,?,?,?)");
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getMail());
			
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
