<%@page import="com.edu.biz.MemberService"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<!-- 소스를 완성하세요 -->

<jsp:useBean id="member" class="com.edu.beans.Member"/>
<jsp:setProperty property="*" name="member"/>

<%
	MemberService biz = new MemberService();
	biz.memberInsert(member);
%>

<jsp:forward page="memberOutput.jsp" />
