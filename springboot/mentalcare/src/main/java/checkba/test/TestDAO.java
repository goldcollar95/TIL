package checkba.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class TestDAO {
	@Autowired
	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	
	}
	
	public List<TestDTO> stressresult(TestDTO dto){
		return session.selectList("stressresult", dto);
	}


	
	

}
