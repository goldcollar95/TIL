package javaExam;

public class ProductTest {

	public static void main(String[] args) {
		ProductDTO fr = new ProductDTO(100, "노트북", 1200000, 2021, "삼성");
		ProductDTO fr1 = new ProductDTO(200, "아이패드", 50000, 2022, "애플");
		ProductDTO fr2 = new ProductDTO(200, "마우스", 15000, 2021, "LG");
		
		
		
		System.out.println(" 상품번호 "  + " 상품명 " + " 가격 " + " 제조년도 " + " 제조사 ");
		System.out.println("===================================");
		System.out.println(fr.toString());
		System.out.println(fr1.toString());
		System.out.println(fr2.toString());
		System.out.println("===================================");
	}
	
}
