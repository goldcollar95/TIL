package chap15;

import java.util.ArrayList;

public class Fortest {

	public static void main(String[] args) {
		String[] arr = {"java", "db", "web client", "web server", "ai"};
		//arr[5] = "spring";	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		arr[4] = "spring"; //인덱스 4번의 ai가 spring으로 바꿔줄때 가능하다.
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);		//배열은 lenght만큼
		}
		//jdk 1.5 개선된 반복문
		for(String s : arr ) {
			System.out.println(s.toUpperCase()); //대문자로 바꿀것.
		}
		
		ArrayList list = new ArrayList(5);
		list.add("java");
		list.add("db");
		list.add("web client");
		list.add("web server");
		list.add("ai");
		list.add("spring");
		list.add(100);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));//리스트는 사이즈만큼 랭스랑 비슷한 의미이다.
		}
		for(Object s : list ) {
			if(s instanceof String) { //이것이 나온이유는 리스트에 정수가 나올수없는 상황인데 if문을 주어서 조건을 바꿔줬다.
				
			
			System.out.println(((String)s).toUpperCase());
			}
			else{
				System.out.println(s);
			}
		}
		
	}

}
