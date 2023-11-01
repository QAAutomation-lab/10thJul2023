package day18.predefinedclasses.stringclasses;
class Selenium{
	private Selenium() {
		System.out.println("I am Selenium class cons...");
	}
	static private Selenium s1=new Selenium();
	
	static Selenium getInstance() {
		return s1;
	}
	
	String name="AutomationTesting";
	int duration=4;
}
public class SingleExample {

	public static void main(String[] args) {
		//Selenium s2=new Selenium();
		
		Selenium s2=Selenium.getInstance();
		System.out.println(s2.name);
		System.out.println(s2.duration);
		s2.name="API testing";
		s2.duration=1;
		System.out.println(s2.name);//
		System.out.println(s2.duration);//
		
		Selenium s3=Selenium.getInstance();
		System.out.println(s3.name);//
		System.out.println(s3.duration);//
	}

}
