package chap9;
class A{
	int v = 10;
	B b1 = new B(); //중첩 클래스 객체 생성 위치 A 내부
	class B{
		int x = 20;
			void bmethod() {
				System.out.println(x);
				System.out.print("v=" + v); 
				//외부클래스 선언 멤버변수 사용가능
				//외부클래스에서 내부클래스에 있는 값들이 저장가능하다
			
		}
	}
	static class C{
		int y = 30;
		void cmethod() {
			System.out.println(y);
		}
	}
	void amethod() {
		B b2 = new B (); //중첩 클래스 타입 객체 지역변수
		System.out.println(b2.x);
	}
}
public class NestedTest {

	public static void main(String[] args) {
			//지역변수
		
		//B b1 = new B(); 여기서는 오류 
		A a1 = new A();
		System.out.println(a1.b1.x);
		a1.b1.bmethod();
		
		A.B b2 = a1.new B();
		System.out.println(b2.x);
		b2.bmethod();
		
		//static 멤버변수 
		A.C c2 = new A.C();
		System.out.println(c2.y);
		c2.cmethod();
	}

}
