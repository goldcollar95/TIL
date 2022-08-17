package member;

public class MemberDAO {
	MemberDTO dto;
	
	public void setDto(MemberDTO dto) {//외부로부터 dto 객체 전달받기 위한 용도
		this.dto = dto;
	}
	public boolean selectMember() {
		if(dto.getId().equals("spring") && dto.getPassword() == 1111) {
			return true;// 정상 로그인 사용자 경우 리턴값
		}
		else {
			return false;//회원가입 경우 리턴값
		}
	}
	public void insertMember() {
		System.out.println(dto.getId() + " 회원님 정상적으로 회원가입되셨습니다.");
	}
}
