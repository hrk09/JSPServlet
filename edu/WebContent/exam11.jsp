<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>

<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
%>    

<%
	//1. JDBC드라이버 로딩하기
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//2. DBMS서버와 접속하기
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url, "scott", "admin123");
	
	//3. Statement 또는 PreparaedStatement 객체 생성하기
	Statement stmt = conn.createStatement();
	PreparedStatement pstmt = conn.prepareStatement("insert into test values(?,?)");
	
	pstmt.setString(1, id);
	pstmt.setString(2, pwd);	
	
	//4. SQL문 실행하기
	//stmt.executeUpdate("create table test(id varchar2(20), passwd varchar2(20))");
	/* 	
 	stmt.executeUpdate("insert into test values('aa','11')");
	stmt.executeUpdate("insert into test values('bb','22')");
	stmt.executeUpdate("insert into test values('cc','33')");
 	*/
 	pstmt.executeUpdate(); //insert
 
 	ResultSet rs = stmt.executeQuery("select * from test");
 	
 	while(rs.next()) {
 		out.print(rs.getString("id") + ":" + rs.getString(2) + "<br>");
 	}
 
	//5. 자원해제하기
	rs.close();
	stmt.close();
	pstmt.close();
	conn.close();
%>
	OKKKKKKKKKKKK