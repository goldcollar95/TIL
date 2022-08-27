package checkba.test;

import java.util.List;

public interface TestService {

	public List<TestDTO> stressresult();

	List<TestDTO> stressresult(TestDTO dto);
	
}
