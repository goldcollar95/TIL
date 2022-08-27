package nonspringmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListController implements Controller {

	@Override
	public String handleAndRequest(HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<HelloDTO> list = new ArrayList();	//배열에 대한 데이터값들을 입력후
		for(int i = 1; i<=5; i++) {
			
		HelloDTO dto = new HelloDTO();
		dto.message(i);
		
		//request.setAttribute(null, dto);	//jsp보내기위한 과정을 준비
		}
		
		
		request.setAttribute("list", list);
		return "list.jsp";	//포워드 하는 부분 서블릿으로 부터 마지막
	}
	
	
	
}
