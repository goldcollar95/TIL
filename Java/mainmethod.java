package chap3;

public class MainMethodTest {
//김한국 100 자바 - 3개 입력
//김한국 100 자바 - 공백도 하나로 포함이 되게 할때는 하나의 스트링으로 만들어준다 -> "김한국 100 자바"
// 100 200 -2개 입력 덧셈 결과 출력 - 300	
	public static void main(String args[]) {
		//숫자값 필요 - 난수 생성 
		//문자열 입력 -키보드 입력 - ???
		System.out.println("명령행 매개변수 갯수 =" + args.length);
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

			System.out.println(args[0] + args[1]); 
			//기능 - 연산자 제공 - api 라이브러리 메소드 제공 - 사용자 구현, String을 int로 바꿔주는 과정이다.
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);
			System.out.println(first+second);
			
			double result = Double.parseDouble("3.14");
			System.out.println(result + result);
	}

}
