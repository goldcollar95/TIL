package chap3;

public class ifTest {

	public static void main(String[] args) {
		// 0.0 <= ? < 1.0 실수 리턴 
		//로또 45숫자 사이안에 움직일수 있도록 하는 것
		System.out.println((int)(Math.random() *45) +1); //1은 시작값 *45난수발생시키는숫자
		
		//0.0 <= ?*100  < 1.0
		//0 <= (int)난수 + 1 < 100 --> 0-99
		
		//키보드로부터 값 입력
		String name ="김학생";
		int kor = (int)(Math.random() * 100) + 1; //1-100 값 난수 발생
		int eng = (int)(Math.random() * 100) + 1;
		int mat = (int)(Math.random() * 100) + 1;
		
		int sum = kor + eng + mat;
		int avg = sum / 3;
		System.out.println("학생명=" + name);
		System.out.println("국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("수학=" + mat);
		System.out.println("총점=" + sum);
		System.out.println("평균=" + avg);
		
		//평균 80 이상이면 "수료" / "미수료" 출력
		String result = "";
		if(avg >= 80) {result = "수료";}
		else {result = "미수료";}
		
		System.out.println(result);
		
		//평균 90 이상이면 "A"/ 70이상이면 "B"/ 50 이상이면 "C" / 나머지 "F"
		String grade = "";
		if(avg > 90) { grade = ("A등급"); }
		else if(avg >= 70 && avg < 90) /*avg<90 의미 내포*/{ grade = ("B등급"); }
		else if(avg >= 50 && avg < 70) { grade = ("C등급"); }
		else {grade = ("F등급");}
		System.out.println(grade); 		
		
	/*	//switch-case 블록구현
		int avg2 = avg / 10; // 99/10 -> 9
		String grade ="";
		switch(avg2) {
		case 10: //만점이 될 경우를 대비
		case 9://if(avg >= 90)
			grade = "A등급";
			break;
		case 8:
		case 7:
			grade = "B등급";
			break;
		case 6:
		case 5:
			grade = "C등급";
			break;
		default: //4,3,2,1,0
			grade = "F등급";
		}
		System.out.println(grade); */
		}
	}  

//1. 선언 변수 사용 범위 고려
//2. 조건문 - 서로 다른 문장 수행 / 동일 문장 반복 수행(반복 제거)


