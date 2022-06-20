package chap2;

public class CastingTest {

	public static void main(String[] args) {
		byte b = 127;
		int i = /*(int)*/b; //자동형변환(모든 값을 저장)
		System.out.println("i=" + 1);
		
		double d = i; //자동형변환 
		System.out.println("d=" + d);

		
		double d2 = 3.14;
		int i2 = (int)d2;//명시적형변환(일부값 손실)
		System.out.println("i2=" + i2);
		
		int i3 = 128;
		byte b3 = (byte)i3;//명시적형변환
		System.out.println("b3=" + b3);
		
		char c4 = 'a';
		int i4 = c4;//자동형변환(문자 -> 숫자)
		System.out.println("c4=" + c4 +" , i4= " + i4);
		
		char c5 = 'A';
		int i5 = c5;//자동형변환(문자 -> 숫자)
		System.out.println("c5=" + c5 +" , i5= " + i5);
		
		//소문자(97)를 대문자(65)로 변경
		System.out.println( (char)(i4 - 32));
		
		/*int i6 = 0;
		boolean b6 = (int)i6;*/ //boolean값은 true와 false만 가져갈수있다.
	}

}
