package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 
@WebServlet("/mypage")
public class MyPageServlet extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		//브라우저 2번째 요청- 클라이언트 세션 id 맞는지 검사
		if(session.getAttribute("seesionid") != null) {
			
		String sessionid = (String)session.getAttribute("sessionid");	
		
		out.println("<h1>"+  sessionid + sessionid + "</h1>");
		}
		else {
			out.println("<h1> 로그인 먼저 하셔야 본인 정보 확인 가능</h1>");
		}
	}

}
