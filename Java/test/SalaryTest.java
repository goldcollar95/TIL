
class Employee{
	int id;
	String name;
	int basePay; //본봉
	int generalFee; //일반수당
	int totalPay;//총급여
	//Employee(){super();} // employee 하위메소드에 필요하기때문에 선언해주었다. manager 클래스때문에 
	Employee(int id, String name, int basePay, int generalFee){
		this.id = id;
		this.name = name;
		this.basePay = basePay;
		this.generalFee = generalFee;
	}
	
	public void calcPay() {
		totalPay = basePay + generalFee;
	}
	
}

class Manager extends Employee{
	int manFee;
	Manager(int id, String name, int basePay,int generalFee, int manFee){
		//super(); 자동정의 Employee()생성자 호출 
		super(id, name, basePay, generalFee); //명시정의 Employee(int, String ,int ,int ) 생성자호출 
		//this.id = id;
		//this.name = name;
		//this.basePay = basePay;
		//this.generalFee = generalFee; 위의 this문장 네게는 super를 대신할수있다.
		this.manFee = manFee;
	}
	public void calcPay() {
		super.calcPay();
		totalPay +=  manFee;
	}
class Engineer extends Employee{
	int certiFee, techFee;
	Engineer(int id, String name, int basePay, int generalFee, int certiFee, int techFee){
		super(id, name, basePay, generalFee);
		//this.id = id;
		//this.name = name;
		//this.basePay = basePay;
		//this.generalFee = generalFee;
		this.certiFee = certiFee;
		this.techFee = techFee;
	}
	@Override
	public void calcPay() {
		super.calcPay();
		totalPay += certiFee + techFee;
		}
	
	
	}
}
	
class Secretary extends Employee{
	int secFee;

	public Secretary(int id, String name, int basePay, int generalFee, int secFee) {
		super(id, name, basePay, generalFee);
		this.secFee = secFee;
	}

	@Override
	public void calcPay() {
		super.calcPay();
		totalPay += secFee;
	}
	
}

public class SalaryTest2 {

	public static void main(String[] args) {
		
		
		Employee e [] = new Employee[4];
		e[0] = new Employee(1000,"이사원",10000,5000);
		e[1] = new Manager(2000,"김간부",20000,10000,10000);
		e[2] = new Engineer(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary(4000,"최비서",15000,7000,10000);
		//자동형변환 이후에 오버라이딩 메소드 호출 - 하위클래스객체포함 메소드 
		//e[0].calcPay();
		//e[1].calcPay();
		//e[2].calcPay();
		//e[3].calcPay();
		//자동형변환 이후에 변수 접근 - 상위클래스 포함 변
		//System.out.println( ((Manager)e[1]).manFee); //형 변환 

		
		
		
		
		
		
		
		
		
		
		System.out.println(" 사번 : 이름 : 본봉 : 총급여");
		for(int i = 0; i< e.length; i++) {
			e[i].calcPay();
			System.out.println(e[i].id + ":" + e[i].name + ":" + e[i].totalPay);
			//e배열 Secretary 객체이면 secFee 변수도 출력 
			if(e[i] instanceof Secretary) {// i=0,1,2(false) i=3(true)
				System.out.println(((Secretary)e[i]).secFee );
			
			} //if
		} //for

	}//main
}//class
