package spring.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("dao")
public class MemberDAO {
	@Autowired
	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}

	public List<MemberDTO> getList() {
		return session.selectList("member.memberlist");
	}

	public int getCount() {
		return session.selectOne("membercount");
	}

	public List<MemberDTO> oneMember(String id) {
		return session.selectList("onemember", id);
	}

	public List<MemberDTO> pagingList(int[] limit) {
		return session.selectList("paginglist", limit);

	}

	public int insertmember(MemberDTO dto) {
		return session.insert("insertmember", dto);

	}

	public int updatemember(MemberDTO dto) {
		return session.update("updatemember", dto);
	}
	
	public int deletmember(String id) {		//여기서 String만 준이유는 리스트로 뽑을필요가없기때문에 ID만 삭제.
		return session.delete("deletemember", id);
	}
	public List<MemberDTO> searchlist(MemberDTO dto){
		return session.selectList("searchlist",dto);
	}
}

