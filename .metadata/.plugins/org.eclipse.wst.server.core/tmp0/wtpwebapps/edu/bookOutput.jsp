<%@page import="com.edu.test.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <% 
    	Book b = (Book)request.getAttribute("book");
    %>
    <%= b.getTitle()%><br>
    <%= b.getAuthor()%><br>
    <%= b.getPublisher()%><br>
    
    <hr>
    
    ${book.title}<br>
    ${book.author}<br>
    ${book.publisher}
    