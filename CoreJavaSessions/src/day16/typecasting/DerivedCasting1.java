package day16.typecasting;
class GrandParent{
	 void myHome() {
		 System.out.println("Home belongs to GrandParent");
	 }
}
class Parent extends GrandParent{
	// Function
	void show() {
		// Print message for this class
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child extends Parent {
	void readme() {
		System.out.println("Child readme method is called");
	}
}
public class DerivedCasting1 {
	// Main driver method
	public static void main(String[] args) {
		System.out.println("****************Ref and Object both of child*********************");
		//Object of Child class and reference of child class
		Child c1=new Child();
		c1.readme();
		c1.callme();
		c1.show();
		c1.myHome();
		System.out.println("****************Ref and Object both of Parent*********************");
		//Object of Parent class and reference of Parent class
		Parent p1=new Parent();
		p1.show();
		p1.callme();
		p1.myHome();
		System.out.println("****************Ref and Object both of GrandParent*********************");
		//Object of Parent class and reference of Parent class
		GrandParent g1=new GrandParent();
		g1.myHome();
	}
}







