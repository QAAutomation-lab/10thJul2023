package day18.predefinedclasses.stringclasses;

public class SingleObject {
	/**
	 * 1. constructor should be private
	 * 2. create static private ref variable of the class
	 * 3. create public static method which return current class object
	 */
	private SingleObject() {
		System.out.println("I am SingleObject cons..");
	}
	private static SingleObject obj=new SingleObject();
	
	public static SingleObject getInstance() {
		return obj;
	}	
	void calling() {
		System.out.println("I am calling");
	}
	int age=101;
}
class Demo{	
	public static void main(String[] args) {
		//SingleObject s1=new SingleObject();
		SingleObject s1=SingleObject.getInstance();
		s1.calling();
		System.out.println(s1.age);
		s1.age=50;
		SingleObject s2=SingleObject.getInstance();
		System.out.println(s2.age);
	}
}
