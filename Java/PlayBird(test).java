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

-------------------------------------------------------------------------------------------------
**수정용**
	
class Bird { 			//두 클래스 공통 특성 변수 + 메서드
	private String name;
	int legs;
	double length; 
	void fly() {}
	void sing() {System.out.println(name + ")가 소리내어 웁니다.");}
	void setName(String n) {this.name = name;} //** 중요한 부분이다. name변수가 Private이 들어온다면 멤버변수는 이런식으로 초기화시켜야함. 
	String getName(){ return name; } //**중요한 부분이다. setter / getter 메소드
	void print() {
		//name = 오리(꽥꽥이), 참새(쨱쨱)
		//System.out.println("오리의 이름은 꽦꽥이입니다");
		//System.out.println("참새의 이름은 짹쨱입니다");
		//equals, equalsIgnoreCase, toUppserCase , toLowerCase
		//split - 문자열 분리
		String[] sp_name =  name.split("[()]"); //or의 의미
		//System.out.print(sp_name[0]);
		//System.out.print(sp_name[1]);
		System.out.print(sp_name[0] + "의 이름은 " + sp_name[1] + "입니다");
		
	
	}
	
}


class Duck extends Bird{
	int web;	//물갈퀴수

	
	//오버라이딩
	void fly() {System.out.println(getName() + ")는 날지 않습니다.");}
	void swim() {System.out.println(getName() + " 가 " + web + "개의 물갈퀴로 수영합니다.");}
	}
	
	

		




class Sparrow extends Bird{
	String friend;
	//오버라이딩
	void fly() {System.out.println(getName() + ")는 날아다닙니다.");}
	void makeFriend() {System.out.println(getName() + "의 친구는 " + friend + "입니다.");}

	}
	
	
	

public class PlayBird2 {

	public static void main(String[] args) {
		Bird b = new Bird();
		Duck duck = new Duck();
		duck.setName("오리(꽥꽥이)");
		duck.web = 2;
		duck.fly(); //오리(꽥꽥이)는 날지 않습니다. //+오버라이딩 메소드 호출 추가
		duck.sing();//Bird상속
		duck.swim();//Duck에서만 존재
		duck.print();//Bird상속
		
		Sparrow spa = new Sparrow();
		spa.setName("참새(짹짹이)");
		spa.friend = "허수아비";
		spa.fly(); //참새(짹짹)가 날아다닙니다. //+오버라이딩 메소드 호출 추가
		spa.sing();//Bird상속
		spa.makeFriend();//Sparrow 존재
		spa.print();//Bird상속
		
		
		}

	}


