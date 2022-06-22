package chap3;

public class ArrayTest2 {

	public static void main(String[] args) {
		String names[] = {"두루미", "제비", "까치", "참새", "백조"}; //선언 + 생성 + 초기화
		int scores [] = new int[5]; //선언 + 생성
		System.out.println("학생수=" + names.length);
		
		//scores 배열 값 출력 "반복" 출력
		for(int index = 0; index < scores.length; index++) {
			System.out.println(names[index]); //사용자 정의값 출력
			System.out.println(scores[index]); //기본값 출력
		}
		//10명 학생 점수 저장 - 초기화 
		for(int index = 0; index < scores.length; index++) {
			scores[index] = (int)(Math.random() * 100) + 1;
			System.out.println(names[index] + " 학생의 점수 : " + scores[index]); //사용자 정의값 출력
			
		}
		
		//총점 , 평균
		int sum = 0;
		int avg = 0;
		for(int index = 0; index < scores.length; index++) {
			sum += scores[index]; //총점 
		}
			avg = sum / scores.length; //평균
			
			System.out.println("총점= " + sum + ", 평균= " + avg);
			//1등
			int max = 0;
			String maxNames = "";
			//84 16 57 9.....
			for(int index = 0; index < scores.length; index++) {
				//index = 0 scores[index] = 84  max = 0
				//index = 1 scores[index] = 16 max = 84
				//index = 2 scroes[index] = 57 max = 84
				//.....
				if(scores[index] > max) {
					max = scores[index];
					maxNames = names[index];    //1등학생이름까지 결과값으로 나오게할때
				}
			}
			System.out.println("1등=" + maxNames + " 학생 = " + max + "점");
			
			
			
			
			//최소값 꼴등
			int min = 999;
			//84 16 57 9.....
			for(int index = 0; index < scores.length; index++) {
				//index = 0 scores[index] = 84  max = 0
				//index = 1 scores[index] = 16 max = 84
				//index = 2 scores[index] = 57 max = 84
				//.....
				if(scores[index] < min) {
					max = scores[index];
				}
				
			}
			System.out.println("마지막 등=" + max);
	}
}
