package javaExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {

	public int insertBook(BookDTO bookDTO) {
		int result = 0;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book", "emp2", "emp2"); 
																									
			System.out.println("연결 성공");

			String sql = "insert into book value(?,?,?,?,?,?)";
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1, bookDTO.getBookNo());
			pt.setString(2, bookDTO.getBookTitle());
			pt.setString(3, bookDTO.getBookAuthor());
			pt.setString(4, bookDTO.getBookYear());
			pt.setInt(5, bookDTO.getBookPrice());
			pt.setString(6, bookDTO.getBookPublisher());
			result = pt.executeUpdate();
			System.out.println("(insert book 내부)삽입행의 갯수=" + result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}

		}
		return result;
	}

	public void selectBook() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book", "emp2", "emp2");

			String sql = "select * from book ";
			PreparedStatement pt = con.prepareStatement(sql);

			ResultSet rs = pt.executeQuery();
			
			System.out.println("===================================================================");
			while (rs.next()) {
				
				String bookNo = rs.getString("bookNo");
				String bookTitle = rs.getString("bookTitle");
				String bookAuthor = rs.getString("bookAuthor");
				String bookYear = rs.getString("bookYear");
				int bookPrice = rs.getInt("bookPrice");
				String bookPublisher = rs.getString("bookPublisher");
				
				System.out.println(bookNo+" \t"+bookTitle+" \t"+bookAuthor+" \t"+bookYear+" \t"+bookPrice+" \t"+bookPublisher);

			}
			System.out.println("===================================================================");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}

		}
		return;
	}

}// class end
