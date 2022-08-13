package start;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dto.MemberDTO;


@WebServlet("/start")
public class StartServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String menu = request.getParameter("menu");
		String jspfile ="";
		if(menu.equals("memberlist")) {	//이건 db가 필요하다. 그러므로 request.setAttr을 해줘야한다.
			MemberDAO dao = new MemberDAO();
			ArrayList<MemberDTO> list = dao.selectAllMember();	//여기서 array는 dao의 리턴값을 가져온다.
			request.setAttribute("memberlist", list);
			jspfile = "/webapp/allmemberlist.jsp";
			
		}
		else if(menu.equals("boardwriting")) {	//이 부분은 db 필요 ㅇ없다
			//http:...? menu= boardwriting&id=admin
			String id ="";
			if(request.getParameter("id") == null) {
				id="guest";
			}
			else {
				id = request.getParameter("id");
			}
			
			HttpSession session = request.getSession();
			session.setAttribute("session_id", id);
			
			
			jspfile = "/start/boardwriting.jsp";
			
		}else if(menu.equals("board")) {	//url에 board라고 치면 success로 가줄게
			jspfile = "/mvc/boardsuccess.jsp";
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher(jspfile);
		rd.forward(request, response);//forward는 요청과 응답메세지를 같이 호출해야한다.

		
	
	}

}
