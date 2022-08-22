package spring.mybatis;



import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) throws IOException{
		//@annotation + mybatis config 파일명 설정
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring/mybatis/spring-mybatis.xml");
	
		
		//db연결
		MemberService service = (MemberService) factory.getBean("service");	//auto commit
		
		
		
		//전체리스트
		List<MemberDTO> list = service.memberlist();
		
		for(int i = 0; i < list.size()-1; i++) {
			System.out.println(list.get(i));
		}
//		
//		System.out.println("total = " + list.get(list.size()-1).getPassword());
		
		
		
		//Insert목록
		
		
		
		
		//특정 멤버 조회
		//키보드 입력 id 조회
//		Scanner key = new Scanner(System.in);
//		System.out.println("조회할 회원의 아이디를 입력하세요");
//		String id = key.next();
//		List<MemberDTO> list2 = service.onemember(id);
//		for(MemberDTO dto : list2) {
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
		
		
		//insert
//		MemberDTO insertdto = new MemberDTO();
//		insertdto.setId("mybatis");
//		insertdto.setPassword(1111);
//		insertdto.setName("홍길동");
//		insertdto.setPhone("01023452222");
//		insertdto.setEmail("ajax@ls.com");
//		
//		int result = service.registerMember(insertdto);
//		System.out.println(result);
//		//특정조건 만족
//		session.commit();
		
		//update
//		Scanner key = new Scanner(System.in);
//		System.out.println("수정할 회원의 아이디를 입력하세요");
//		String id = key.next();
//		List<MemberDTO> selectlist = service.onemember(id);//조회정보저장
//		System.out.println("수정할 회원의 정보를 입력하세요(컬럼명=변경값의 형식으로 입력하세요)");
//		String updateInform = key.next();
//		
//		MemberDTO updatedto = new MemberDTO();
//		updatedto.setId(id);
//		String colName = updateInform.split("=")[0];
//		String colValue = updateInform.split("=")[1];
//		if(colName.equals("name")) {
//			updatedto.setName(colValue);
//			updatedto.setEmail(selectlist.get(0).getEmail());	//이메일 원래값
//			updatedto.setPhone(selectlist.get(0).getPhone());	//폰번호 원래값
//		}
//		else if(colName.equals("email")) {
//			updatedto.setEmail(colValue);
//			updatedto.setName(selectlist.get(0).getName());	//이메일 원래값
//			updatedto.setPhone(selectlist.get(0).getPhone());	//폰번호 원래값
//			
//		}
//		else if(colName.equals("phone")) {
//			updatedto.setPhone(colValue);
//			updatedto.setName(selectlist.get(0).getName());	//이메일 원래값
//			updatedto.setEmail(selectlist.get(0).getPhone());	//폰번호 원래값
//		}
//		
//		int result = service.updateMember(updatedto); 	//결과받아오려면 Int result 후 
//		System.out.println(result);
		
		
		
		
//		Scanner key = new Scanner(System.in);
//		System.out.println("삭제할 회원의 아이디를 입력하세요");
//		String id = key.next();
//		int result = service.deleteMember(id);
//		if(result == 0) {
//			System.out.println("가입 한적 없습니다");
//		}
//		else {
//			System.out.println("정상적으로 삭제되었습니다");
//		}
		
//		Scanner key1 = new Scanner(System.in);
		//여기는 오류부분 내가 적어본곳
//		System.out.println("아이디 = " +  , "암호 = " + password, "이름 = " + name, "폰번호 = " + phone, "이메일 =" +email);
//		Scanner key1 = new Scanner(System.in);
//		String id = key1.next();
//		List<MemberDTO> list1 = dao.oneMember(dto.getId());
//		session.insert("member.insertmember",dto);
//		if(list1 == null || list1.size() == 0 ) {
//			System.out.println(dto);
			
//		}
		
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
