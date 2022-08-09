package process;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;


@WebServlet("/insertdb")
public class InsertDBServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter o = response.getWriter();
		String output = "";
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPassword(Integer.parseInt(pw));
		dto.setName(name);
		dto.setPhone(phone);
		dto.setEmail(email);
		MemberDAO dao = new MemberDAO();
		//member 테이블 같은 id 레코드 여러개 생기는 이유 - pk 제약조건 설정 x 
		int condition = dao.selectMember(id, pw);
		if(condition == 3) {
			int rows = dao.insertMember(dto);
			if(rows == 1) {
				
			output = "<h1>정상적 회원가입. <a href=logindb.html> 로그인 하러가기</a></h1>";
			}
		}else {
			output = "중복되었습니다 <a href=insertdb.html> 다시가입 </a></h1>";
		}
		o.println(output);
	}

}
