public MemberDTO updateMember(MemberDTO dto) {
		Connection conn = null;
		int condition = 0;//UPDATE한 행의 갯수
		MemberDTO returnDto = null; 
		try {
//			//1.context.xml 파일 정의 내용 읽어올 준비
//			Context initContext = new InitialContext();
//			//2. <Resource 이름 태그들  설정 읽어와
//			Context envContext = (Context)initContext.lookup("java:/comp/env");// java - component - environment파일
//			//3. jdbc/mydb 설정 태그만 읽어와서 connection pooling 클래스 객체 생성
//			DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");	
//			//4.
//			conn = ds.getConnection();
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection
			("jdbc:mysql://127.0.0.1:3306/memberdb", "emp2", "emp2");
			
		String sql = "update member set name=?, phone=? , email=? where id=? and password=?";
		PreparedStatement pt = conn.prepareStatement(sql);
		pt.setString(1, dto.getName());
		pt.setString(2, dto.getPhone());
		pt.setString(3, dto.getEmail());
		pt.setString(4, dto.getId());
		pt.setInt(5, dto.getPassword());
		condition = pt.executeUpdate();
		if(condition >= 1) {
			String sql2 = "select id, password , name, phone, email, "
					+ " date_format(regdate, '%Y년도%m월%d일') as regdate  from member";
			pt = conn.prepareStatement(sql2);
			ResultSet rs = pt.executeQuery();
			while(rs.next()) {//여러개 있으면 최종 반복 레코드만 저장
				returnDto = new MemberDTO();
				returnDto.setId(rs.getString("id"));
				returnDto.setPassword(rs.getInt("password"));  
				returnDto.setName(rs.getString("name"));
				returnDto.setPhone(rs.getString("phone"));
				returnDto.setEmail(rs.getString("email"));
				returnDto.setRegdate(rs.getString("regdate"));
			}
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {   }
		}
		return returnDto;
	}//UPDATEMember end
	
/*	public static void main(String args[]) { //run on server./java application(DataSource 사용불가)
		MemberDTO dto = new MemberDTO("xxx",1111, "이름", "01011112222", "이메일@tech.com" , null );
		MemberDTO dto2 = new MemberDAO().updateMember(dto);
		System.out.println(dto2);
	}
*/
}//class
