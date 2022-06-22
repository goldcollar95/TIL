package chap3;
// 2-100 모든 자연수에 대하여 각 자연수들이 소수인지 판단 출력
// 2 : 소수이다 2,3,5,7,11,13,17,19,23,
// 3 : 소수이다
// 4 : 소수가 아니다
//...
//100: 소수가 아니다
public class PrimeNumberTest {
//명령행 매개변수 5 50 - 5부터 50 사이 모든 자연수 소수인지 판별
	
	public static void main(String[] args) {
		int su = 100; //2 ~ su 까지 모든 자연수 
		for(int j = 2; j <= su; j++) { //2~100 j변수 소수인지 판별 대상 
			int count = 0;
			for(int i = 1; i <= j; i++) {
				if(j % i == 0 ) {count++;}
			}
			
				
			if(count == 2 ) {
			System.out.println(j + " : 소수이다");
			}
			else {
				System.out.println(j + " : 합성수이다");
			}

		}
		
		//5부터 50 사이
	  int begin = Integer.parseInt(args[0]);
	  int end = Integer.parseInt(args[1]);
	  
	  for(int j = begin; j<end; j++) {
		  int count = 0;
		  for(int i = 1; i <= j; i++) {
			  if(j % i == 0) {count++;}
		  }
		  if(count == 2) {
			  System.out.println(j + " : 소수이다");
		  }
		  else {
			  System.out.println(j + " : 합성수이다");
		  }
	  }
		
	}
}
