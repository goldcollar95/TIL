//클래스를 활용한 예제 

package chap4;

public class EmployeeTest {

	public static void main(String[] args) {
		// Employee클래스복사본 메모리 저장-실행
		Employee e1 = new Employee(); //employee복사본을 만들어주라.
		e1.id = 100;
		e1.name = "김사원";
		e1.pay = 1000;
		e1.title = "사원";
		e1.dept = "IT";
		
		System.out.println("사번=" + e1.id + " , 이름=" + e1.name +" , 급여=" + e1.pay);
		
		
		Employee e2 = new Employee(); //employee복사본을 만들어주라.
		e2.id = 200;
		e2.name = "박대리";
		e2.pay = 1500;
		e2.title = "대리";
		e2.dept = "인재개발부";
		
		System.out.println("사번=" + e2.id + " , 이름=" + e2.name +" , 급여=" + e2.pay);
	}

}
