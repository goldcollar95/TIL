import java.text.SimpleDateFormat;
import java.util.Date;

class OverridingTest2 {
		    public static void main(String args[]){
		        int i = 10;
		        int j = 20;
		        
		        MySum ms1 = new MySum(i, j);
		        MySum ms2 = new MySum(j, i);

		        
		    System.out.println(ms1);//30
			System.out.println(ms2);//30
			
			
				
		        if(ms1.equals(ms2)) {
				System.out.println("ms1과 ms2의 합계는 동일합니다.");
			}

			String s1 = new String("30");
		        if(ms1.equals(s1)) {
				System.out.println("ms1과 s1은  동일합니다.");
			}

			System.out.println("ms1 객체를 출력한 시각은 " + ms1.createTime() + " 입니다.");
		    }
		}

		class MySum {
		    int first;
		    int second;
		    
		    //생성자 정의 
		    MySum (int first, int second){
		        this.first = first;
		        this.second = second;
		    }

		    /* 조건1 - toString */
			public String toString() {
				return String.valueOf(first + second); //int를 String으로
				
				
			}
			/* 조건2 - equals  */

			@Override
			public boolean equals(Object obj) { //자바 모든 클래스 타입 객체는 obj전달 가능
				if(obj instanceof MySum) {
					String me = this.toString(); // 현재객체 toString
					String other = obj.toString(); //전달 객체의 toString 메소드
					boolean result = me.equals(other); //String.equals(문자열 내용 비교)
							if(result == true) {
								return true;
			}
				else {
					return false;
				}
			}
				return false;
			}
			
				/* 조건3 - createTime */
		String createTime(){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 dd일 HH시 mm분 ss초");
			return sdf.format(new Date());
		}
	}
			
				
				
		
			
			
				
			
	
	
							
			

	



