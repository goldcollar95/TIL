정적 컨텐츠 이미지

웹 브라우저 -> local8080/파일을 저장하고자 하는 경로 -> 내장 Tomcat Server -> hello-static관련 컨트롤러X
-> resources: static/hello-static.html -> hello-static.html 문구완료

Controller(비지니스 로직)
View (화면관련)

ResponseBody 원리
웹 브라우저 -> localhost8080-> 내장 톰켓 -> ResponseBoday return:hello(name:spring)
-> HtppMsgconverter -> Json,String 
