package checkba.test;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class TestController {

	
	@Autowired
	TestService service;
	
	
	@RequestMapping(value="/stressresult", method=RequestMethod.GET)
	public ModelAndView stressresult() {
		List<TestDTO> stressresult = service.stressresult();
		ModelAndView mv = new ModelAndView();
		mv.addObject("stressresult", stressresult);
		mv.setViewName("self/stressresult");
		return mv;
	}
	
	
	
	
	
}
