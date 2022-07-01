<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<% if(session.isNew() || session.getAttribute("id") == null){ %>
		
		${msg}
	
		<form action="logProc.jsp" method="post">
			ID : <input type="text" name="id"><br> 
			PWD: <input	type="password" name="pwd"><br> 
			<input type="submit" value="LOGIN">
		</form>
		<% }else{ %>
		<p> <a href="logProc.jsp">LOGOUT</a> </p>
	<% } %>