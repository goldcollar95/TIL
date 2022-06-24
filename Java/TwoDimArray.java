package chap3;

public class TwoDimArray2 {

	public static void main(String[] args) {
				//String name[] = {"철수, 경희, 지혜"};//이름
				//int sum = 0;//총점 
				//int avg = 0;//평균
		// 3명학생 2과목 점수 - {{1,2} {3,4,5} {5,6,7,8}}
				int array2[][] = new int[3][]; //[3] - 3명의 학생의 점수들 기록 - 2, 3, 4
				String names[] = new String[args.length];
				if(args.length >= 3) {
					for(int i = 0; i < args.length; i++) {
						names[i] = args[i];
					}
				}
				//명령행 매개변수 학생이름 3명 입력 저장 배열
				//구현
				// 철수 경희 지혜
				

				//2차배열 접근 코드 - for 내부 for 포함
				//이름 같이 출력
				// 각 학생의 총점 / 평균
				// xxxx 학생 : { 점수들 } : 해당학생의 총점 = xxx : 해당학생의 평균 : xxxx
				for(int i = 0; i < array2.length; i++) { //3
					 array2[i] = new int[i+2]; //과목수에 따른 배열 
					 System.out.print( names[i] + "학생 : {");
					 int sum = 0;
					 int avg = 0;
					 for(int j = 0; j < array2[i].length; j++) {
						 array2[i][j] = (int)(Math.random() * 100)+1;
						 System.out.print(array2[i][j] + " ");
						 sum += array2[i][j];
					 }
					 avg = sum / array2[i].length;
					 System.out.println("} : 총점= " + sum + " : 평균 = " + avg);
				}
	}//main end
}//class end
