package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 
@WebServlet("/bank")
public class BankServlet extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//브라우저 2번째 요청- 클라이언트 세션 id 맞는지 검사
		String sessionid = (String)session.getAttribute("sessionid");	
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>  " + sessionid + "인증되셨습니다.(5분만 유효합니다)</h1>");
		session.setMaxInactiveInterval(60*5);
	}

}
