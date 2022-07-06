*본인풀이*

package chap15;
class MusicThread extends Thread{
	//상속 . 생성자. 오버라이딩 - 음악듣는중입니다 3번 출력
	//오버라이딩 run
	String sing;
 
	MusicThread(String sing){
		this.sing = sing;
	}
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println("음악듣는 중입니다 =" + i);
		}
	}
}

class DownloadThread extends Thread{
	//상속 . 생성자. 오버라이딩  - 다운로드중입니다 10번 출력
	String down;
	
	DownloadThread(String down){
		this.down = down;
	}
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("다운로드 중입니다 =" + i);
		}
	}
}

class NewsThread extends Thread{
	//상속 . 생성자. 오버라이딩  - 뉴스보는 중입니다 5번 출력	
	String news;
	
	NewsThread(String news){
		this.news = news;
	}
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("뉴스보는 중입니다 =" +i );
			
		}
	}
}
//arr값에 인덱스가 도착할때, 하나씩 선언하여 쓸수있게끔 선언해야함
public class MyThreadTest extends Thread {

	public static void main(String[] args) {
		Thread arr[] = new Thread[3]; //class A extends Thread 
		arr[0] = new MusicThread("음악");
		
		arr[1] = new NewsThread("뉴스");
		
		arr[2] = new DownloadThread("다운로드");
		
		arr[0].start();
		arr[1].start();
		arr[2].start();
		
		/*3개 스레드 실행 시작 메소드 호출 */
		
		/* 음악듣는중입니다
		 * 음악듣는중입니다
		 * 음악듣는중입니다
		 * 다운로드중입니다
		 * 뉴스보는 중입니다
		 * 음악듣는중입니다
		 * 음악듣는중입니다
		 * ....
		 * 
		 *   */
		
		

	}

}
