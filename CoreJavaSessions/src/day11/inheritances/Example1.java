package day11.inheritances;
//parent/super/base class
class Country{
	//default constructor
	void display() {
		System.out.println("I am display method of Country");
	}
}
//child/subclass
class State extends Country{
	//default constructor with default super()
	void calling() {
		System.out.println("I am calling method of State");
	}
}
public class Example1 extends State{
	//default constructor with default super()
	void testing() {
		System.out.println("I am testing method of Example0");
	}
	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.testing();
		e1.calling();
		e1.display();
	}
}
/**
in order to achieve inheritance we need constructor chaining-
constructor chaining- 
			when subclass constructor calls super class constructor and 
			super class constructor calls its super class constructor dn its 
			known as constructor chaining
to achieve constructor chaining we need to user super().

super() is used to call parent class constructor based on parameter
super() should be the first statement inside the constructor body
*/