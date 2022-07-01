<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h3>test</h3>
<%! public int sum(int a, int b){
		return a+b;
}	%>

<% int c= this.sum(10, 20); %>
<%= c %>