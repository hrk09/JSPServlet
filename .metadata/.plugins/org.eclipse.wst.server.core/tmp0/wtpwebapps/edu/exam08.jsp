<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- test08.jsp랑 같은 코드 -->
	<form action="bookReg" method="post">
		제목: <input type="text" name="title" value="${book.title}"><br>
		저자: <input type="text" name="author" value="${book.author}"><br>
		출판사: <input type="text" name="publisher" value="${book.publisher}"><br>
		<input type="submit" value="등록">
	</form>