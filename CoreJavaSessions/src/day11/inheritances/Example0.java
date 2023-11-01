package day11.inheritances;
class Country100{
	//default constructor
	void display() {
		System.out.println("I am display method of Country");
	}
}
class State100 {
	//default constructor
	void calling() {
		System.out.println("I am calling method of State");
	}
}
public class Example0 {
	void testing() {
		System.out.println("I am testing method of Example0");
	}
	public static void main(String[] args) {
		Country100 c1=new Country100();
		c1.display();		
		State100 s1=new State100();
		s1.calling();		
		Example0 e1=new Example0();
		e1.testing();		
	}
}
/**
using inheritance we can inherit non-static member parent class to child

to represent inheritance we need to use "extends" keyword between child and parent

		parent class---> super class | base class
		child class ---> sub class   | derived class

in order to achieve inheritance we need constructor chaining-

constructor chaining- when subclass constructor calls super class constructor and 
						super class constructor calls its super class constructor dn its 
						known as constructor chaining
						
to achieve constructor chaining we need to user super().

super() is used to call parent class constructor based on parameter
super() should be the first statement inside the constructor body
*/