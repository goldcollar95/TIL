package chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) throws IOException  {
		
		//입력
		// 쇼핑몰 메뉴
		// 반복문 5번 입력하면 종료
		// 계속 1-4번 메뉴 보여주고 선택
		Scanner scan = new Scanner(System.in);
	 
		
				
	
		//String intputfile = "src/chap18/ScannerTest2.java";
		//String outputfile = "user.txt";
		FileWriter fw = new FileWriter("user.txt", true);
		while(true) {
		System.out.println("1. 회원가입 ");
		System.out.println("2. 로그인 ");
		System.out.println("3. 장바구니 ");
		System.out.println("4. 쇼핑 ");
		System.out.println("5. 종료 ");
		System.out.println("원하는 작업의 번호를 입력하세요 :" );
		
		//출력
	
		int menu = scan.nextInt();
		if(menu == 5) {
			//System.exit(0);	//프로그램 완전종료
			break; // 현재 반복문만 종료
		}else if(menu == 1) {
			
			System.out.println("아이디 :	"  );
			String id = scan.next();
			System.out.println("암호 : "  );
			String pw = scan.next();
			fw.write(id + " " + pw + "\n");
	
			 
			/*키보드로
			 * 아이디 : idtest 
			 * 암호 : pwtest
			 * 입력쪽에 출력이 되고 idtest pwtest를 입력하면 user.txt로 들어갈수있도록 
			 * 
			 * 현재작업디렉토리 user.txt파일 저장
			 * idtest pwtest 1 유저 가입 정보 저장
			 * .......
			 * */
		}else if(menu == 2) {
			System.out.println("로그인아이디 : ");
			String loginid = scan.next();
			System.out.println("로그인암호 : ");
			String loginpw = scan.next();
			
			FileReader fr = new FileReader("user.txt");
			Scanner sfr = new Scanner(fr);
			boolean exists = false;
			
			while(sfr.hasNextLine()) {
				String user = sfr.nextLine();
				
			if(user.equals(loginid + " " + loginpw)) {
				System.out.println("정상적인 로그인 " + loginid + "님");
				exists = true;
				break;
			}
			}
			if(exists == false) {
				System.out.println("회원가입 하세요"); 
				
			}
			sfr.close();
			fr.close();
			fw.close();
			}else if(menu == 3) {
				System.out.println("장바구니");
			}else if(menu == 4) {
				System.out.println("상품 리스트를 보여드립니다");
			}
			/*키보드로
			 * 아이디 : idtest1
			 * 암호 : pwtest1
			 * 
			 * 
			 * 현재작업디렉토리 user.txt 파일에서 각 줄마다 조사
			 * idtest pwtest 조회
			 * 로그인아이디와 로그인암호 일치하는 줄이 있으면 "정상적으로 로그인되셨습니다 xxxx회원님"
			 * 로그인아이디와 로그인암호 일치하는 줄이 없으면 "회원가입 하세요 xxxx회원님"
			 * 
			 * 
			 * .......
			 * */
			
			
			}
		}//while end
	
	}// main

