package day18.predefinedclasses.scannerclass;
class Demo {
	void display() {
		System.out.println("Demo class display method");
	}
	void callMe(int num) {
		System.out.println("Demo class callMe method");//
	}
	Demo() {
		System.out.println("Demo class cons..");
	}
}
public final class StaticReference {
	static void testing() {
		System.out.println("I am testing method of staticreference class");
	}
	static Demo k1=new Demo();
	public static void main(String[] args) {
		System.out.println("########################");
		StaticReference.k1.display();
		StaticReference.k1.callMe(456);
		System.out.println("******************************");
		// access Demo class non-static member
		Demo d1=new Demo();
		d1.display();
		d1.callMe(123);		
		StaticReference.testing();
		
		System.err.println("I am written using err");
	}
}
