<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


    <h3>회원가입</h3>
    
	<form action="exam11.jsp" method="post"> <!-- ID/PWD는 URL에 노출되면 안되므로 POST 방식으로 해야함 -->
		ID : <input type="text" name="id"><br>
		PWD: <input type="password" name="pwd"><br>
		<input type="submit" value="JOIN">
	</form>
