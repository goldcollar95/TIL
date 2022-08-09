package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//session 객체 리턴
		HttpSession session = request.getSession();
		String sessionid = null;
		if(session.getAttribute("sessionid") != null) {
			  sessionid = (String)session.getAttribute("sessionid");
			  session.removeAttribute("sessionid");
			
		}
		else {
			sessionid = "guest";
		}
		//sessionid 변수 저장값 삭제
		//출력 x
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + sessionid + "회원님 로그아웃되셨습니다.</h1>");
	}

}
