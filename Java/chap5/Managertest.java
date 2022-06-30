package chap5;

class Employee{
    int id;
	String name = "회사원"; //Employee.name
	double pay;
	void printInform() {
		System.out.println(id + ":" + name + ":" + pay);
		
	}
	
	
}

class Manager extends Employee{
	String name = "관리직"; //Manager.name
	String jobOfManage;
	void test() {
		 //String name = " 지역변수";
		 System.out.println(name); //지역변수
		 System.out.println(this.name); //현재멤버변수
		 System.out.println(super.name); //상속멤버변수 
	}
	
	//printInform Employee 정의 내용을 MANAGER 재정의하면 우선 실행
	@Override // "@Override" 설명(실행 영향 O)
	void printInform() {
		//System.out.println(id + "+" + name + ":" + pay);
		super.printInform();
		System.out.println(jobOfManage);
	}
}

public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.id = 200;
		//m.name = "홍길동";
		m.pay = 34500.99;
		m.jobOfManage = "IT관리";
		System.out.println("사번=" + m.id );
		System.out.println("이름=" + m.name );
		System.out.println("급여=" + m.pay );
		System.out.println("관리업무=" + m.jobOfManage );
		m.printInform();//Employee 상속 메소드 실행
		m.test(); //3줄 출력 
		
	}

}
