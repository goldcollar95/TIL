package javaExam;

public class ProductDTO {
	int prdNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMaker;
	
	
	
	@Override
	public String toString() {
		return  prdNo   +"   " + prdName + "   " + prdPrice + " " + prdYear
				+ "  " + prdMaker ;
	}



	ProductDTO(int p1, String p2, int p3, int p4, String p5){
		
		prdNo = p1;
		prdName = p2;
		prdPrice = p3;
		prdYear = p4;
		prdMaker = p5;
		
		
	}
	
}
