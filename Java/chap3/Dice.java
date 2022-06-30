package chap3;

public class DiceTest2 {

	public static void main(String[] args) {
		//주사위 2개를 던져서 2개의 주사위 눈의 숫자와 합을 출력하기. 이 때 눈의 합이 5이면 중단하기
//(1,3)=4 
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		int sum = dice1 + dice2;
		int x = 0;
	//주사위게임 끝났습니다.	
	while (sum != 5) {
		System.out.println("(" + dice1 + " , " + dice2 +  " ) = " + sum);
				dice1 = (int)(Math.random()*6)+1;
				dice2 = (int)(Math.random()*6)+1;
				sum = dice1 + dice2;
		
	}
	
	System.out.print("(" + dice1 + "," + dice2 + ") = " + sum);
	System.out.println("===>끝(" + x + "  번 주사위놀기 )");
		
	}
}
