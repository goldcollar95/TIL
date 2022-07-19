package dto;
//data transfer object - 데이터 중간 저장 전달 목적 객체 Controller 같은 역할?
// MemberVO - VALUE OBJECT
public class MemberDTO {	// 1개 레코드
	String id;
	int password;
	String name;
	String phone;
	String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	String regdate;
	//toString(), 생성자 정의 추가
}
