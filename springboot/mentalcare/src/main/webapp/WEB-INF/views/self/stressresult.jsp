<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-3.6.0.min.js" ></script>
<script>
let countA = 0;
let countB = 0;
let countC = 0;
let countD = 0;

$(document).ready(function(){
	$("#btnA").on('click', function(){
		countA += 1;
	});
	$("#btnB").on('click', function(){
			countB += 1;
	});
	$("#btnC").on('click', function(){
			countC += 1;
	});		
	$("#btnD").on('click', function(){
			countD += 1;
	});
	
});
</script>
</head>
<body>
<!-- 1번 -->
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">

<!-- 2번 -->
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">

<!-- 3번 -->
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">

<!-- 4번 -->
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">

<!-- 5번 -->
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">

<!-- 6번 -->
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">

<!-- 7번 -->
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">
<input type="button" id="btnA" value="">


</body>
</html>