package mybatis;



import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberMain {

	public static void main(String[] args) throws IOException{
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();	//설정파일준비
		SqlSessionFactory factory = builder.build
			(Resources.getResourceAsReader("mybatis/mybatis-config.xml"));
		
		//db연결
		SqlSession session = factory.openSession();
		
		//MEMBERLIST	-	전체리스트 + 회원수
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		dto.setId("");
		dto.setPassword(0);
		dto.setName("");
		dto.setPhone("");
		dto.setEmail("");
		dao.setSession(session);
		
		MemberServiceImpl service = new MemberServiceImpl();
		service.setDao(dao);
		List<MemberDTO> list = service.memberlist();
		
		for(int i = 0; i < list.size()-1; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("total = " + list.get(list.size()-1).getPassword());
		
		
		
		//Insert목록
		
		
		
		
		//특정 멤버 조회
		//키보드 입력 id 조회
//		Scanner key = new Scanner(System.in);
//		System.out.println("조회할 회원의 아이디를 입력하세요");
//		String id = key.next();
//		List<MemberDTO> list2 = service.onemember(id);
//		for(MemberDTO dto1 : list2) {
//			System.out.println(dto.getId() + ":" + dto.getName());
//		}
//		
//		System.out.println("====================");
//		//페이징처리
//		int[] limit = {0,4};
//		List<MemberDTO> list3 = service.paginglist(limit);
//		for(MemberDTO dto2 : list3) {
//			System.out.println(dto);
//		}
//		System.out.println("==================");
		
		Scanner key = new Scanner(System.in);
		
//		System.out.println("아이디 = " +  , "암호 = " + password, "이름 = " + name, "폰번호 = " + phone, "이메일 =" +email);
		List<MemberDTO> list1 = dao.oneMember(dto.getId());
		session.insert("member.insertmember",dto);
		if(list1 == null || list1.size() == 0 ) {
			System.out.println(dto);
			
		}
		
		/*
		//sql실행	 = 메소드 = DAO, 기능단위  = 메소드 = 서비스
		List<MemberDTO> list = session.selectList("memberlist");

		//sql조회
		for(MemberDTO dto : list) {
			System.out.println(dto);
		}
		
		int count = session.selectOne("member.membercount");
		System.out.println("total=" + count);*/
	}

}
