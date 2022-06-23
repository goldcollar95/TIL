package chap3;

public class TwoDimArray {

	public static void main(String[] args) {
		// 3명학생 2과목 점수 - {{1,2} {3,4} {5,6}}
		int array[][] = new int[3][2];
		System.out.println("1차배열 데이터갯수=" + array.length); // 3 2 5 6
		
		//2차배열 접근 코드 - for 내부 for 포함
		for(int i = 0; i < array.length; i++) { //3
			//System.out.println(i + "번째 1차배열의 데이터 갯수=" +array[0].length); //개수알아보는 표현
			 for(int j = 0; j < array[i].length; j++) {
				 array[i][j] = (int)(Math.random() * 100)+1;
				 System.out.println(array[i][j]);
			 }
		}//outer
		
		// 3명학생 2과목 점수 - {{1,2} {3,4,5} {5,6,7,8}}
				int array2[][] = new int[3][]; //[3] - 3명의 학생
				String[] names = new String[args.length];//명령행 매개변수 학생이름 3명 입력 저장
				System.out.println("1차배열 데이터갯수=" + array.length); // 3 2 5 6
				
				//2차배열 접근 코드 - for 내부 for 포함
				for(int i = 0; i < array2.length; i++) { //3
					 array2[i] = new int[i+2]; //과목수에 따른 배열 
					 System.out.println(array2[i].length);
					 System.out.print("{");
					 for(int j = 0; j < array2[i].length; j++) {
						 array2[i][j] = (int)(Math.random() * 100)+1;
						 System.out.print(array2[i][j] + " ");
					 }
					 System.out.println("}");
				}
				// 각 학생의 총점 / 평균
				// xxxx 학생 : { , , } : 총점 = xxx : 평균 :
	}//main end
}//class end
