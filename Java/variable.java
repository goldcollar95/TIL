package chap2;

public class VariableTest {

	public static void main(String[] args) {
		boolean b1 = true; //값 저장 선언
		boolean b2 = false;
		boolean b3 = 10 > 0;
		
	
		System.out.println("b1의 값 출력=" + b1);// b1 저장 값 출력
		System.out.println("b2의 값 출력=" + b2);
		System.out.println("b3의 값 출력=" + b3);
		
		int i1 = 100;
		int i2 = 200;
		System.out.println(i1 + i2);
		System.out.println("i1+i2=" + (i1 + i2));
		
		System.out.println("int최대값=" + Integer.MAX_VALUE); //int 4byte = 32bit - 2^31~ 2^31-1
		System.out.println("int최값=" + Integer.MIN_VALUE); //(API 라이브러리 사용)
		//Byte.MAX_VALUE 
		//int i3 = 2147483647 + 1;
		
		char c1 = 'a';
		char c2 = '\n';
		System.out.println("c2=" + c2);
		System.out.println("c1=" + c1);
		
		int i4 = 65;
		char c4 = 'A';
		System.out.println( i4 + c4); //130. String + 다른타입, 숫자+숫자
		System.out.println( (char)i4); //A
		System.out.println( (int)c4); //65
	}

}
