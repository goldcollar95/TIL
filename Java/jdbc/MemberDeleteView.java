package view;

import java.util.Scanner;

import dao.MemberDAO;

public class MemberDeleteView implements View {
	
	@Override
	public void input() {
	Scanner sc = new Scanner(System.in);
	System.out.print("아이디 입력 :");
	String id = sc.next();
	System.out.print("암호 입력 : ");
	String password = sc.next();
	MemberDAO dao = new MemberDAO();
	int result = dao.deleteMember(id, password);
	//member 존재하면 삭제 1 리턴
	if(result == 1) {
		System.out.println("회원 탈퇴 처리되셨습니다.");
	}
	else if(result == 0 ) {
		System.out.println("암호가 다릅니다.");
		}
	}
}
