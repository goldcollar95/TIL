package javaExam;

public class BookTest {

	public static void main(String[] args) {
		BookDTO bt = new BookDTO();
		BookDAO ba = new BookDAO();
		
		
		
		// - 입력 데이터 : B004 HTML/CSS 고길동 2021 38000 서울출판사
		bt.setBookNo("B004");
		bt.setBookTitle("HTML/CSS");
		bt.setBookAuthor("고길동");
		bt.setBookPrice(38000);
		bt.setBookYear("2021");
		bt.setBookPublisher("서울출판사");
		
		ba.insertBook(bt);
		ba.selectBook();
		
	}
}
