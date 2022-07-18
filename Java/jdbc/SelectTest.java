//DB연동

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest6 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			//설치한 mysql driver 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이브 호출 완료");
			//1. db연결
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empdb", "emp2", "emp2"); //emp 계정은 empdb만 사용권한
			System.out.println("연결 성공");
			
			System.out.println("===============");
			/*String query = "select hire_date, sum(salary)"
					+ "from employees ";
			Statement st = con.createStatement();	//내가 해본것
			ResultSet rs = st.executeQuery(query);	//내가 해본것
			rs.next();
			System.out.println(rs.getInt(1) + " : " +  rs.getDouble("sum(salary"));	//내가 해본것
			
			
			 * 키보드로 입력
			 * 제외할 월 : 01 - 12 사이 값 입력()
			 * ==> 입사월별 급여 총합 구하되 입력 월은 제외.
			 * 
			 * 입사월 급여 총합
			 * 	01	  xxx
			 * 
			 *  ....
			 *  12	  xxx
			 *  
			 *  */
			Scanner scan = new Scanner(System.in);
			System.out.println("제외할 월 : ");
			String month = scan.next();
			String sql = "select month(hire_date) 입사월, sum(salary) '급여 총합' "
					+ "	from employees "
					+ "	where month(hire_date) != " + month
					+ "	group by month(hire_date)"
					+ "	order by 입사월";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("입사월") + " : " + rs.getInt("급여 총합"));
			}
			rs.close();
			
			
			}catch(ClassNotFoundException e) {
				System.out.println("미설치이거나 classpath 미등록 또는 드라이버명 오타 확인");
			}catch(SQLException e) {
			System.out.println("db연결 정보 잘못 확인");
			e.printStackTrace(); // 연결된 정보의 자세한 오류 확인
		}finally {
			//4. db연결해제
			try {
			con.close();	//mysql 외부 연결 허용 최대치 
			System.out.print("연결 해제 성공");
			}catch(SQLException e) {}
		}

	}

}
