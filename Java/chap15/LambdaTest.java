@FunctionalInterface	// @ annotation 0 컴파일러 알려주는 설명
interface I1{
	/*public abstract*/void m1();
	
}
interface I2{
	void m1(int x);
}

interface I3{
	void m1(int x, int y);
}

interface I4{
	int m1(int i, int j);
}
//1개 메소드만 정의 인터페이스 일 때 = functional interface
public class LambdaTest {

	public static void main(String[] args) {
		// 매개변수 타입 생략 , 매개변수 갯수 1개 괄호 생략
		// {} 내부 1문장 {}
		I1 i1 = ()->System.out.println("람다테스트");	//람다식 정의.I1
		i1.m1(); //람다식 호출 실행
		
		I2 i2 = x->System.out.println(x);
		i2.m1(10);
	
		I3 i3 = (x, y)-> {System.out.println(x*y); System.out.println(x+y);};	//타입은 생략가능. 
		i3.m1(5, 8);
	
		//리턴타입 있는 메소드는 { ... return xxx;} 
		//리턴타입 있는 메소드에서 reutrn문장 1개만 구현 {}생략, return생략
		I4 i4 = (i,j) ->  i+j;
		int result = i4.m1(10,20);
		System.out.println(result);
	
		}
}
