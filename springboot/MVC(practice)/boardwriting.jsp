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

<h1>게시물 작성 폼</h1>
<form action = 'boardsuccess.jsp'>
제목:<input type=text name="title" ><br>
내용:<textarea name="contents" cols=50 rows=5 ></textarea> 
작성자:<input type=text name="id" value="${session_id }">
<input type="submit" value="게시물작성">
</body>
</html>
