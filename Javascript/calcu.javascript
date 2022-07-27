<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>

var input = prompt("숫자:"); 
//document.write(typeof su1 + "<br>"); //prompt는 string으로 나온다 그래서 변환시켜야한다 - 타입확인한다.
var inputint = parseInt(input);
var input1 = prompt("사칙연산");
var input2 = prompt("숫자2:");
var inputint2 = parseInt(input2);	// inputint , inputint2 = 형변환
if(input1 === "+"){
	//var result = input + input1 + input2 + "=" + (inputint + inputint2);
	var result = `${input} ${input1} ${input2} = ${inputint + inputint2}`;
}
else if(input1 === "-"){
	var result = input + input1 + input2 + "=" + (inputint - inputint2);
}
else if(input1 === "*"){
	var result = input + input1 + input2 + "=" + (inputint * inputint2);
}
else if(input1 === "/"){
	var result = input + input1 + input2 + "=" + parseInt(inputint / inputint2);
}
else {
	var c = confirm("잘못된 연산입니다")
	if( c == true){
		var result = input + input1 + input2 + "=" + (inputint + inputint2); 
	}
	else{
		var result = "다시 입력하세요"
	}
}
document.write(result + "<br>");

</script>


</body>
</html>
