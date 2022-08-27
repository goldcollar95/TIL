package checkba.test;

public class TestDTO {

	
	
    String result;
    String result_title;
    String result_contents;
	String healing_title;
	String healing_contents;
	
	
	public TestDTO() {}
	public TestDTO(String result, String result_title, String result_contents, String healing_title, String healing_contents) {
		super();
		this.result = result;
		this.result_title = result_title;
		this.result_contents = result_contents;
		this.healing_title = healing_title;
		this.healing_contents = healing_contents;
		
		
		
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResult_title() {
		return result_title;
	}
	public void setResult_title(String result_title) {
		this.result_title = result_title;
	}
	public String getResult_contents() {
		return result_contents;
	}
	public void setResult_contents(String result_contents) {
		this.result_contents = result_contents;
	}
	public String getHealing_title() {
		return healing_title;
	}
	public void setHealing_title(String healing_title) {
		this.healing_title = healing_title;
	}
	public String getHealing_contents() {
		return healing_contents;
	}
	public void setHealing_contents(String healing_contents) {
		this.healing_contents = healing_contents;
	}
	
	
	
	
}
