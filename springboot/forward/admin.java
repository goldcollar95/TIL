<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>

<h1> admin.jsp 파일입니다. </h1>
<H2><%=URLDecoder.decode(request.getParameter("name")) %> 관리자용 메뉴 </H2>
<%
 String [] menu = (String[])request.getAttribute("menu");
 for(int i = 0; i < menu.length; i++){
	 out.println("<h3>" + menu[i] + "</h3>");
 }
%>
</body>
</html>
