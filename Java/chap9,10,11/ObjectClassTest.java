package chap11;

public class ObjectClassTest {

	public static void main(String[] args) {
		MyObject o1 = new MyObject("MyObject");
		MyObject o2 = new MyObject("MyObject");
		
		System.out.println(o1/*to.String()호출결과출력*/);	//java.lang.Object@626b2d4a
		System.out.println(o2);
	
		
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//패키지명.클래스명@16진수변경(주소고유번호-10진수)
		//출력내용 변경 의도 - toString 오버라이딩
		
		
		if(o1 == o2) {//false.오버라이딩불가능
			System.out.println("o1 == o2 같다");
		}
		if(o1.equals(o2)) {//false.오버라이딩(변경가능)
			// 1. o2 가 MyObject 타입 객체인지 체크( 타입 다르다면 false)
			// 타입이 일치한다면 o1 msg와 o2 msg 동일한지 체크 (변수값 다르다면 false)
			// 변수값 동일하면 true
			System.out.println("o1.equals(o2) 같다");
		}
	}

}

class MyObject /*extends Object*/ {
	String msg;
	MyObject(String msg){
		this.msg = msg;
	}
	//toString 오버라이딩
	@Override
	public String toString() {
		return msg;
	}
	//equals 자동상속
	//+
	@Override
	// 1. o2 가 MyObject 타입 객체인지 체크( 타입 다르다면 false)
	// 타입이 일치한다면 o1 msg와 o2 msg 동일한지 체크 (변수값 다르다면 false)
	// 변수값 동일하면 true
	
	//o1.equals(new String("MyObject"))
	public boolean equals(Object obj) { // Object obj = o2(Myobject객체)
		if(obj instanceof MyObject) {
			boolean result = this.msg.equals(((MyObject)obj).msg);
			return result;
		}
		else {
			return false;
		}
	}




}
