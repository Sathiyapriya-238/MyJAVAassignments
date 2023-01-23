package week4.day1;

public class Automation extends MultipleLanguage implements TestTool,Language {

	public void Java() {
		System.out.println("Java is a Language");
	}

	public void Selenium() {
		System.out.println("Selenium is a Testing tool");
		
	}

	@Override
	public void Ruby() {
		System.out.println("Ruby is one of the language");
		
	}
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.Java();
		obj.Selenium();
		obj.Ruby();
		obj.Python();
	}

}