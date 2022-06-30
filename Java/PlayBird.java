class Bird { 			//두 클래스 공통 특성 변수 + 메서드
	String name = "꽥꽥이";
	String name1 = "쨱짹";
	int legs;
	int length;
	String fly;
	String sing;
	String print;
	
	
	void fly(){
		System.out.println("오리" + "(" + (name) + ")" + "는 날지 않습니다.");
}
	
	void sing(){
		System.out.print("오리" + "(" + (name) + ")" + "소리내어 웁니다.");
	
}
	
	void setName(){	
}
	
	void print(){
		System.out.println("오리의 이름은" + "(" + (name) + ")" + "입니다"); //꽥꽥이
	
	}
}


class Duck extends Bird{
	int web = 2;	//물갈퀴수
	String swim;
	//생성자 정의
	Duck(){
	
		web = 2;
	}
	
		
		
	void swim() {
		System.out.println("\n오리" + "(" + (name) + ")" +"가" + web + "개의 물갈퀴로 수영합니다.");
	}
}
		




class Sparrow extends Duck{
	
		
	

	String friend = "허수아비";
	
	void fly() {
		System.out.println("참새" + "(" + (name1) + ")" + "는 날아다닙니다.");
		
	}
	
	void sing() {
		System.out.print("참새" + "(" + (name1) + ")" + "소리내어 웁니다.");		
	}
	
	
	void makeFriend() {
		System.out.println("\n참새의 친구는" + friend + "입니다");
		
	}
	
	void print() {
		System.out.println("참새의 이름은" + "(" + (name1) + ")" + "입니다"); //짹짹		
	}
	
	
}



public class PlayBird {

	public static void main(String[] args) {
		Bird b = new Bird();
		Duck d = new Duck();
		Sparrow s = new Sparrow();
		
		
		b.fly();
		b.sing();
		d.swim();
		b.print();
		s.fly();
		s.sing();
		s.makeFriend();
		s.print();
		}

	}


