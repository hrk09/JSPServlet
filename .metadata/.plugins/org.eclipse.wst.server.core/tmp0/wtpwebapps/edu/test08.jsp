<%@page import="com.edu.test.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- JSP 코드로 SCOPE에 등록된 데이터 사용하는 코드 -->
    <% 
    	Book book = (Book)request.getAttribute("book"); 
    
    	if(book == null) {
    		book = new Book();
    %>
    
	<h1>책 정보 등록</h1>
	<form action="bookReg" method="post">
		제목: <input type="text" name="title" value="<%=book.getTitle() %>"><br>
		저자: <input type="text" name="author" value="<%=book.getAuthor() %>"><br>
		출판사: <input type="text" name="publisher" value="<%=book.getPublisher() %>"><br>
		<input type="submit" value="등록">
	</form>
	
	<%} %>