package tv;

public class TvMain {

	public static void main(String[] args) {
		TV tv = null;
		//tv 주문하면 공장 생산 - 제공
		TVFactory factory = new TVFactory(); 
		tv = factory.getTV(args[0]);
		tv.powerOn();
		tv.volumeUp(10);
		tv.volumeDown(5);
		tv.powerOff();
	}

}
//개발자 - 일부 코드 수정시에 같이 수정할 부분 많아진다면 힘들다 - 결합도 높다 - coupling 높다 


