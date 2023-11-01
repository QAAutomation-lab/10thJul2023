package day11.inheritances;
class GrandFather10{
	GrandFather10(){
		System.out.println("GrandFather10 class cons...");
	}
	void home() {
		System.out.println("Grand Father home");
	}
}
class Father10 extends GrandFather10{
	Father10(int i){
		//super(); this will be written by java compiler
		System.out.println("Father10 class cons...");
	}
	void car() {
		System.out.println("Father's car");
	}
}
/*
 * Parent/user/base class:  Father10
 * Child/sub/derived class: Child10
 */
public class Child10 extends Father10{
	Child10(){
		super(10);// this will be written by java compiler
		System.out.println("Child10 class cons...");
	}
	void bike() {
		System.out.println("Childs bike");
	}
	public static void main(String[] args) {
		Child10 c1=new Child10();
		c1.home();
		c1.car();
		c1.bike();
	}
}
/**
super(): use to call another constructor of parent class/super class based on the parameter
super(): should be the first statement inside the constructor body
with the help super() we can achieve constructor chaining 

*/