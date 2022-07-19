package view;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberUpdateView implements View {
	
	@Override
	public void input() {
		//키보드입력 - dto 저장 - dao . 수정메드 호출
	Scanner sc = new Scanner(System.in);
	System.out.print("아이디 입력 :");
	String id = sc.next();
	System.out.print("수정항목 입력(암호, 이름, 폰번호, 이메일 중 한개 입력)");
	String updateName = sc.next();
	System.out.print("수정값 입력 :");
	String updateValue = sc.next();
	 
	
	MemberDTO dto = new MemberDTO();
	dto.setId(id);
	if(updateName.equals("암호")) {
		dto.setPassword(Integer.parseInt(updateValue));
		
	}
	else if(updateName.equals("이름")) {
		dto.setName((updateValue));
	}	
	else if(updateName.equals("폰번호")) {
		dto.setPhone((updateValue));
		}
	else if(updateName.equals("이메일")) {
		dto.setEmail((updateValue));
		}
		MemberDAO dao = new MemberDAO();
		int result = dao.updateMember(dto);	//id = 입력값 , password = 0, name = 입력값
		System.out.println(result + " 개의 행 변경 ");	//
		
	}
}	 
	
