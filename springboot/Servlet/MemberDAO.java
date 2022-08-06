package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.MemberDTO;

public class MemberDAO {
	//MEMBER 테이블 CRUD
	public int selectMember(String id, String userpassword) {
		Connection conn = null;
		int condition = 0;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection
		("jdbc:mysql://127.0.0.1:3306/memberdb", "emp2", "emp2");
		
		String sql = "select id, password from member where id=?";//member 테이블 id 컬럼 pk 
		PreparedStatement pt = conn.prepareStatement(sql);
		pt.setString(1, id);
		ResultSet rs = pt.executeQuery();
		//sql 실행 결과 여러개 레코드 검색되거나 1개 검색 --> 1번째 레코드 조회
		//sql 실행 결과 0개 검색
		
		String dbid=null, dbpassword=null;
		if(rs.next()) {
			condition = 1; //id 존재한다
			dbid = rs.getString("id");
			dbpassword = rs.getString("password");
			//id 존재하고 pw 동일하다
			if(dbpassword.equals(userpassword)) {
				condition = 2;
			}
		}
		else {
			//id 존재하지 않는다
			condition  = 3;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {   }
		}
		return condition;
	}


public int insertMember(MemberDTO dto) {
	Connection conn = null;
	int condition = 0;
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection
	("jdbc:mysql://127.0.0.1:3306/memberdb", "emp2", "emp2");
	
	String sql = "insert into member values(?,?,?,?,?,now())";
	PreparedStatement pt = conn.prepareStatement(sql);
	pt.setString(1, dto.getId());
	pt.setInt(2, dto.getPassword());
	pt.setString(3, dto.getName());
	pt.setString(4, dto.getPhone());
	pt.setString(5, dto.getEmail());
	condition = pt.executeUpdate();

	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			conn.close();
		}catch(SQLException e) {   }
	}
	return condition;
	}
}
