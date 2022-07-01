<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <jsp:forward page="exam01.jsp" /> --%>

<%-- <% String path = request.getParameter("p"); %>
<jsp:forward page="<%= path %>"/> --%>

<%-- EL로 처리하기 --%>
<jsp:forward page="${param.p}" />