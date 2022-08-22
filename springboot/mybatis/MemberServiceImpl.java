package mybatis;
import java.util.List;

public class MemberServiceImpl implements MemberService {

	MemberDAO dao;

	public void setDao(MemberDAO dao) {
		this.dao = dao;

//Controller의 역할
	}

	@Override
	public List<MemberDTO> memberlist() {
		List<MemberDTO> list = dao.getList();
		int count = dao.getCount();
		list.add(new MemberDTO(null, count, null, null, null, null));
		return list; // main 결과 리턴 = 갯수 마지막 포함
	}

	@Override
	public List<MemberDTO> onemember(String id) {
		return dao.oneMember(id);

	}

	@Override
	public List<MemberDTO> paginglist(int[] limit) {
		return dao.pagingList(limit);

	}


	@Override
	public int registerMember(MemberDTO dto) {
		//dto.getId() 조회
		List<MemberDTO> list = dao.oneMember(dto.getId());
		//조회결과 여부 확인
		if(list == null || list.size() == 0) {
			return dao.insertmember(dto);
		}
		else {
			return 0;
		}
	}
	//업데이트
	@Override
	public int updateMember(MemberDTO dto) {
		List<MemberDTO> list = dao.oneMember(dto.getId());	//ID존재하는지 확인여부 유무 dao호출
		if(list.size() > 0) {
			return dao.updatemember(dto);
		}
		else {
			return 0;
		}
	}

	@Override
	public int deleteMember(String id) {
		List<MemberDTO> list = dao.oneMember(id);
		//조회결과 여부 확인
		if(list == null || list.size() == 0) {
			return dao.deletmember(id);
		}
		else {
			return 0;
		}
	}
}
