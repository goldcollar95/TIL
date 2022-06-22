package chap3;

public class Pay2 {

	public static void main(String[] args) {
		String product[] = {"라면","음료수","계란","사과"};
		int price[] = {500,2500,8000,1000};
		int pricePerProduct[] = new int[4]; //각각의 제품 총가격 
		
		int totalPrice = 0;
		for(int i = 0; i < product.length; i++) { //위의 데이터타입 아무거나 써도 상관x
			pricePerProduct[i] = price[i]* Integer.parseInt(args[i]); //500 * 7
			String result = product[i] + ":" + price[i] + "원 : " + args[i] + "개 :"  + pricePerProduct[i];
					
			System.out.println(result);  //4가지 제품 , 총가격 한꺼번에 출력
			totalPrice += pricePerProduct[i];
		}
		
		System.out.println("총 지불 가격은" + totalPrice + "원 입니다");
		System.out.println("지불 수단은" + args[4] + "입니다");
		if(args[4].equals("현금")) {
			System.out.println("현금영수증처리번호는" + args[5] + "입니다 ");
			
			String s1 = "java";
			String s2 = "java";
			String s3 = new String("java");
			String s4 = new String("java");
			System.out.println("s1 == s2 결과 =" + (s1 == s2));
			System.out.println("s3 == s4 결과 =" + (s3 == s4));
			System.out.println("s1.equals(s2) 결과 =" + s1.equals(s2));
			System.out.println("s3.equals(s4) 결과 =" + s3.equals(s4));
		}
	}
}
		
		
			//명령행 매개변수 - 7 2 1 5 카드 --> 5개 입력
		//라면 7개 음료수 2개 계란 1개 사과 5개 사고 지불 의미
		//명령행 매개변수 - 7 2 1 5 현금 010-1234-5678  --> 6개 입력
		//라면 7개 음료수 2개 계란 1개 사과 5개 사고 현금 지불, 현금영수증폰번호 의미
		//라면 : 500원 : 7개 : 라면 총가격
		//음료수..
		//계란..
		
		//총 지불가격은 xxxx원 입니다. 
		//선택하신 지불 수단은 명령행매개변수 5번째 입력값 xxxx 입니다.
		//만약 현금이면 명령행매개변수 6번째 입력값
		//현금영수증처리번호는 xxxxx입니다.
		
	
