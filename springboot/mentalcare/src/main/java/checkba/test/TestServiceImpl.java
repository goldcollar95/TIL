package checkba.test;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("service")
public class TestServiceImpl implements TestService {
	@Autowired
	TestDAO dao;

	@Override
	public List<TestDTO> stressresult(TestDTO dto) {
		return dao.stressresult(dto);
	}

	@Override
	public List<TestDTO> stressresult() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
