<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>

<%
	InitialContext ic = new InitialContext();	//JNDI 서버
	DataSource ds = (DataSource)ic.lookup("java:conp/env/jdbc/myoracle");
	Connection conn = ds.getConnection();
%>