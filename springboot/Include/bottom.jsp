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
<img src='/html/images/cau1.jpeg'>
<h3>contact - 이메일로 문의하세요</h3>
<h4>location - 서울시 동작구 흑석동</h4>
<% if(request.getParameter("id") != null){ %>
<%=request.getParameter("id") %>sir, do you interest xx?
<%=request.getParameter("file") %>from be merge.
<%}%>
</body>
</html>
