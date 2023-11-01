package day11.inheritances;
//super class/ parent class / base class
class Grandfather {
	Grandfather() {
		System.out.println("I am Class Grandfather constrctuor...");
	}
	void myHome() {
		System.out.println("I am home of Grandfather");
	}
}
//subclass / child class / derived class
class Father extends Grandfather {
	Father(double d) {
		//super();// if we dont wirte this dn java compiler will write by default super()
		System.out.println("I am Class Father constrctuor...");
	}
	void myCar() {
		System.out.println("I am car of Father");
	}
}
class Child1 extends Father {
	Child1(int i) {
		super(12.34);
		System.out.println("I am Class Child constrctuor...");
	}
	void myBike() {
		System.out.println("I am bike of child");
	}
}
public class Inheritance6 {
	public static void main(String[] args) {
		System.out.println("*******************************************");
		Child1 c1 = new Child1(21);// home, car & bike
		c1.myHome();
		c1.myCar();
		c1.myBike();
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
//		Father f1=new Father(254.1);
//		f1.myCar();
//		f1.myHome();
//		Father f2=new Child1(25);
//		f2.myCar();
//		f2.myHome();
		
		Father f1 = c1;//Father f1 = c1=new Child1(21); home, car but bike will not be visible/accessible to father
		f1.myHome();
		f1.myCar();
		//f1.myBike(); //error as its a property of child
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g1 = c1;//Grandfather g1=c1=new Child1(21); home but car & bike will not be visible/accessible to Grandfather
		g1.myHome();
//		g1.myCar();
//		g1.myBike();
		System.out.println("*******************************************");
	}
}
/*
 * add debug point into the required steps
 * use following keys
 * 		f6	----> next line, execute current line and move next file
 * 		f5  ----> go inside the function
 * 		f8  ----> continue, to continue the normal execution flow
 * 		ctrl+shift+f ----> to check the variable value or method return value
 */
/*
 * statements are two type
 * 		1. Homogeneous :    LHS = RHS
 * 		2. Heterogeneous :  LHS != RHS
 * 
 * 			int age=20; // Homogeneous
 * 			double salary=25000; //Heterogeneous
 * 			
 * 			A a1 = new A();
 * 			A a2 = new B();
 * 			A a3 = a1;
 * 			B b1 = new B();
 * 			A a4 = b1;
 */ 
