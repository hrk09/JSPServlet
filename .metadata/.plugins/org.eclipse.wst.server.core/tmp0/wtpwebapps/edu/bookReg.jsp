<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<jsp:useBean id="book" class="com.edu.test.Book" />

<jsp:setProperty property="*" name="book" /><br>

<% request.setAttribute("book", book); %>

<jsp:forward page="bookOutput.jsp" />
