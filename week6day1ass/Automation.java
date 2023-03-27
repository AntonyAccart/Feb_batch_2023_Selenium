package week6day1ass;

public class Automation extends MultipleLanguage{

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java method");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium method ");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby method ");
	}
	
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.java();
		auto.selenium();
		auto.ruby();
		auto.python();
	}
}