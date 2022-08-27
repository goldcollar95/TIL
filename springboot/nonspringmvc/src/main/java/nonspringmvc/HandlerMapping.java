package nonspringmvc;

import java.util.HashMap;

public class HandlerMapping {
	//생성자
	HandlerMapping<String, Controller> mappings = new HashMap<String, Controller>();
	HandlerMapping(){
		
	
	mappings.put("hello", new HelloController());
	mappings.put("list", new ListController());
	}
	
	
	Controller getController(String key){
		System.out.println("키="+key);
		reutrn mappings.get(key);
	}
	//getControoler
}
