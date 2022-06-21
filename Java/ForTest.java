package chap3;

public class ForTest {

	public static void main(String[] args) {
		//1-10 정수들의 총합 출력
/*		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("i=" + i);// 1+2+3+...+10
			sum += i;// 0+1 , 1+2, 3+3
		}
		System.out.println("sum=" + sum);
*/	
		
/*		int sum = 0;
		int i = 1;
		while(i <10) {
			System.out.println("i=" + i);
			sum += i;
			i++;
		
		}
		System.out.println("sum" + sum);
	*/
		
/*		int sum = 0;
		int i = 1;
		do {
			System.out.println(i);
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("sum="+sum);
		
*/		
				
 
		
		//1-50 사이의 난수를 발생시켜 10의 배수가 아니면 출력. 10의 배수이면 중단
		int su = (int)(Math.random() * 50) + 1; // 1 - 50
		while(su % 10 != 0) { //10의 배수 확인법 여기서는 반대로 취함
			System.out.println(su);
			su = (int)(Math.random() * 50) + 1; // 1 - 50
		
		}
	}

}
