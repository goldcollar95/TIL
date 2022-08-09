package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/boardwriting")
public class BoardWritingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//세션 객체 리턴
		HttpSession session = request.getSession();
		String sessionid = null;
		if(session.getAttribute("session") == null) {
			 sessionid ="guest";
		}
		else {
			 sessionid = (String)session.getAttribute("sessionid");	//getAttr의 형변환			
		}
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String printing = "<h1>글쓰기폼</h1>";
		printing += "<table border=3>";
		printing += "<tr><td>제목</td><td><input type = text name=title></td></tr>";
		printing += "<tr><td>내용</td><td><textarea name=contents rows=5 cols=50></textarea></td></tr>";
		printing += "<tr><td>작성자</td><td><input type = text name=writer value="
				+ sessionid + " readonly></td></tr>";
		printing += "</table>";
		//세션 객체 저장 sessionid 변수
		out.println(printing);
	}

}
