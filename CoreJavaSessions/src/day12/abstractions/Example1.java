package day12.abstractions;
interface Selenium{
	/*
	 * 100% abstract, only abstract method & variable
	 * methods are by default public abstract
	 * variables are by default public static final
	 * 
	 * Interface is also incomplete, we can;t create an instance of this
	 * 
	 * while inheriting interface there will a contract between subclass and interface, subclass has to override all
	 * the abstract method of interface otherwise subclass will become abstract class
	 * 
	 * when subclass inherits the interface, it uses implements keyword instead of extends
	 * No constructor, no normal method 
	 */
	int age=10;//public static final int age=10;
	void calling();//public abstract void calling();
}
interface QTP{
	void display();
}
public class Example1 implements Selenium,QTP{
	
	public void display() {
		System.out.println("I am overried method of QTP");
	}
	public void calling() {
		System.out.println("I am overrided method of Selenium class");
	}
	public static void main(String[] args) {

		Example1 e1=new Example1();
		e1.calling();
		e1.display();		
		Selenium s1=new Example1();
		s1.calling();
		QTP q1=new Example1();
		q1.display();
		
//		Selenium s2=new Selenium();
//		QTP q2=new QTP();
	}

}
