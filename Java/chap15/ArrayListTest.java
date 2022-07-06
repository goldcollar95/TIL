package chap15;

import java.util.ArrayList; // collection framework
class Employee{
	int id;
	String name;
	double pay;
	Employee(int id, String name, double pay){
		this.id = id;
		this.name = name;
		this.pay = pay;
		
		
		
		}
	@Override
	public String toString() {
		return id + "-" + name + "-" + pay;		// toString으로 하는 부분은 메뉴에서 
												// Source에서 Override Method에서 오버라이딩 해주어야한다.
	}
	
	}

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5); // 5 + 5 + 5 . . . .
		//컬렉션 프레임워크 기본형 변수 X, 객체들만 저장 O 
		//int -- Integer 타입 같은 타입 간주 = autoboxing / auto unboxing
		//기본 --> 참조 클래스
		list.add("java");
		list.add(100);
		list.add(3.14);
		list.add("jsp");
		list.add(true);
		list.add('a');
		Employee e1 = new Employee(100, "김사원", 67000.88);
		list.add(e1);
		Employee e2 = new Employee(100, "박대리", 77000.88);
		list.add(e2);
		Employee e3 = new Employee(100, "최과장", 87000.88);
		list.add(e3);
		System.out.println(list.size());
		
		//add(Object o) 정의 / Object <- get(int)
		//6 위치의 값 = id변수값 - name변수값 - pay변수값 출력 
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(i + "위치의 값=" + list.get(i) /* .toString()*/);
		}
	}

}
