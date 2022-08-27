package nonspringmvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//총 두개
//http://localhost:8080/nonspringmvc/list
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트 서버 진입 대문
		String uri = request.getRequestURI();	// /nonspringmvc/hello
		String uri_array[] = uri.split("/");
		String result = uri_array[uri_array.length -1];
		//System.out.println(result);
		
		HandlerMapping mappings = new HandlerMapping(); //put("hello", new Hello)
		Controller con = mappings.getController(result);
		String viewname = con.handleAndRequest(request, response);
		//뷰이름리턴
		
		RequestDispatcher rd = request.getRequestDispatcher(viewname);
		rd.forward(request, response);
	}

}
