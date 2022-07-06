
class C extends Thread{
	int data = 10;
	public void run() {
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {}
		data = data * 2;
		System.out.println("run메소드=" + data);
	}
}


public class JoinTest {

	public static void main(String[] args) {
		 System.out.println("main시작");
		 C c1 = new C(); //멀티스레드 객체 생성, c1.data -> 10
		 c1.start(); //run 즉각실행보장x . (실행 전)c1.data => 10,(실행 후) ca.data = 20
		 try {
			c1.join(); //cup c1 스레드 실행 변경, c1.run수행
		 }catch(InterruptedException e) {
			 
		 }
		 System.out.println(c1.data);   
		 System.out.println("main종료");

	}

}
