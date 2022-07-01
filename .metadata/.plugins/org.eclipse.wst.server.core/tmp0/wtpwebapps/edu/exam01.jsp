<%@ page import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="java.io.*, javax.sql.*" %>

<h1>Date: 시간</h1>

<% Date d = new Date();	%>
<%= d %> <!--  out.print(d); 랑 같은 의미--> <br>

<%@ include	file="exam02.jsp"	%>