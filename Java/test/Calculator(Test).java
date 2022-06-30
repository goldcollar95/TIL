class Calculator {
	
	
	//변수 3개 변수 선언
	int num1 = 100;
	int num2 = 50;
	String operator = "";
	String num3 = "";
	//메소드
	public Calculator(int p_num1, int p_num2, String p_operator, String p_num3) {
		num1 = p_num1;
		num2 = p_num2;
		num3 = p_num3;
		operator = p_operator;
	}
	public Calculator(int p_num1, int p_num2, String p_operator) {
		num1 = p_num1;
		num2 = p_num2;
		num3 = "";
		operator = p_operator;
	}
	public Calculator(int p_num1, int p_num2) {
		num1 = p_num1;
		num2 = p_num2;
		num3 = "더하기";
		operator = "";
	}
	public Calculator(int p_num1) {
		num1 = p_num1;
		num2 = 50;
		num3 = "더하기";
		operator = "";
	}
	public Calculator() {
		num1 = 100;
		num2 = 50;
		num3 = "";
		operator ="";
	}
	public void print() {
		
	}
	public void print(String string) {
		// TODO Auto-generated method stub
		
	}

	
		
	
}


public class CalculatorTest {

	public static void main(String[] args) {
		//생성자 (매개변수..){}
	
		String[] Calculator = new String[]{"더하기,곱하기,나누기,빼기"};
			
		
		Calculator calc = new Calculator(100, 50, "+");
		System.out.println(calc.num1 + calc.num2 + "입니다");
		calc.print();// 100 + 50 = 150입니다
		// calc 클래스 num1<-100, num2 <- 50, operator = "-" 저장
		
		Calculator calc2 = new Calculator(100, 50, "-"); 
		System.out.println(calc2.num1 - calc2.num2 + "입니다");
		calc2.print();// 100 - 50 = 50입니다
		
		Calculator calc3 = new Calculator(100, 50, "*"); 
		System.out.println(calc3.num1 * calc3.num2 + "입니다");
		calc3.print();// 100 * 50 = 5000입니다
		
		Calculator calc4 = new Calculator(100, 50, "/"); 
		System.out.println(calc4.num1 / calc4.num2 + "입니다");
		calc4.print();// 100 / 50 = 2입니다
		
		
		
		Calculator calc5 = new Calculator(100, 50, "더하기");
		for(int i = 0; i < Calculator.length; i++)
			if(Calculator.equals("더하기")) {
			
		System.out.println(calc5.num1 + "더하기" + calc5.num2);
		calc5.print("인식할수 없습니다");// 100 더하기 50 = 인식할 수 없는 연산자입니다. 
	
		}
	} //main 
}//class
