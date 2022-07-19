package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.MemberDTO;

//data access object
// 키보드입력 / 웹브라우저 / 명령행 매개변수 입력 - DTO 형태 전달받아서
//MEMBER 테이블에 대한 CRUD 메소드 구현 클래스
//DATA ACESS OBJECT
public class MemberDAO {
	public int insertMember(MemberDTO dto) {
		int result = 0;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/memberdb", "emp2", "emp2"); //emp 계정은 empdb만 사용권한
			System.out.println("연결 성공");
			 
			String sql = "insert into member values(?,?,?,?,?, now())";
			PreparedStatement pt = con.prepareStatement(sql);
	 
			pt.setString(1, dto.getId());	//jdbc driver - setString 데이터 ' '자동
			pt.setInt(2, dto.getPassword());
			pt.setString(3, dto.getName());
			pt.setString(4, dto.getPhone());
			pt.setString(5, dto.getEmail());
			result = pt.executeUpdate();
			System.out.println("(insertMember내부)삽입행의 갯수=" + result);	// 오류 확인 출력
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(SQLException e) {}
		}
		return result;
	}//updateEmp
	
	public int updateMember(MemberDTO dto) {
		int result = 0;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/memberdb", "emp2", "emp2"); //emp 계정은 empdb만 사용권한
		
			//dto.getId(), dto.getPassword != 0, dto.getName() != null
			
			String colName = "";
			String colValue = "";
			if(dto.getPassword() != 0) {
				colName = "password";
				colValue = String.valueOf(dto.getPassword());
			}
			else if(dto.getName() != null) {
				colName = "Name";
				colValue = dto.getName();
			}
			else if(dto.getPhone() != null) {
				colName = "phone";
				colValue = dto.getName();
			}
			else if(dto.getEmail() != null) {
				colName = "email";
				colValue = dto.getEmail();
				
				
			String sql = "update member set " + colName + " =? where id=? ";
			
					
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1, colValue);	
			pt.setString(2, dto.getId());
			result = pt.executeUpdate();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(SQLException e) {}
		}
		return result;
	}
	
	public int deleteMember(String id, String password) {
		int result = 0;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/memberdb", "emp2", "emp2"); //emp 계정은 empdb만 사용권한
		
			String sql = "select password from member where id = ?";
			PreparedStatement pt1 = con.prepareStatement(sql);
			pt1.setString(1, id);
			ResultSet rs = pt1.executeQuery();
			
			boolean isPW = false;
			while(rs.next()) {
				if(password.equals(rs.getString("password"))) { // { 이런 부분잘봐 
			String sql2 = "delete from member where id=? and password = ?";
				PreparedStatement pt2 = con.prepareStatement(sql2);
				pt2.setString(1,  id);
				pt2.setString(2,password);
				result = pt2.executeUpdate();
				isPW = true;
				
			}
			 
			
		}
			if(isPW == false) {
				return 0;
			}
				 
			 
			 
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(SQLException e) {}
		}
		return result;

	//update, delete
	//select(String id)
	//select(int first, int count)
	//select()
	}//class end
			
	public int selectOneMember(String id, String password) {

		int result = 0;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/memberdb", "emp2", "emp2"); //emp 계정은 empdb만 사용권한
		
			String sql = "select id , password from member where id = ?";
			PreparedStatement pt = con.prepareStatement(sql);
			
				 
			 
			 
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(SQLException e) {}
		}
		return result;

	//update, delete
	//select(String id)
	//select(int first, int count)
	//select()
	}//class end
	
	}

// SQL : INSERT, UPDATE, DELETE, SELECT - 회원관리프로그램 - 기본 기능 - CRUD
// CRUD : CREATE, READ, UPDATE, DELETE		
	
	//키보드입력데이터 - MEMBER 저장
	//MAIN - 키보드입력데이터

	
	
	

