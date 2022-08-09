package process;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//id를 이용해 호출.
@WebServlet({ "/RegisterServlet", "/register" })
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자 요청 받아오자
		//HttpServletRequest - http 요청정보객체
		// <form action = "/register"
		// <input type = next name = "id" >
		// <input type = submit value ="" > 
		String name = request.getParameter("name");	// input안에 있는 id 변수를 읽게해줘.	//요청받을때 request는 상관 xx
		String subject[] = request.getParameterValues("subject");	//배열로 return받음 
		
		if(name == null ||   name.equals(""))  {
			name = "손님";
			}
		
		if( subject == null ||  subject.length == 0) {
			subject[0] = "손님";
			}
		
		//처리 결과 - 자바 구현
		
		//HttpServletResponse - http응답가능객체
		//결과 응답 = 서버출력(클라이언트 입력)
		response.setContentType("text/html;charset=utf-8");	//응답은 reponse라는 객체를 이용해서 한다.!
		PrintWriter out = response.getWriter();
		
		System.out.println();
		out.println("<h1>" + name +" 회원님 ");
		for(int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + " ");
		}
		out.println( "과정을 선택하셨습니다 </h1> "); //입력하신 id는 xxxx입니다.
		
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()) {
			out.println(names.nextElement()+ "<br>");
		}
	}

}
