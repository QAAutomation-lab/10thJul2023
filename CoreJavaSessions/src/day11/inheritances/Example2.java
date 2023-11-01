package day11.inheritances;
class Country1{
	Country1(int i){
		System.out.println("I am int-param cons of Country class");
	}
	void display() {
		System.out.println("I am display method of Country");
	}
}
class State1 extends Country1{
	State1(){
		super(25);
		System.out.println("I am zero-param cons of State class");
	}
	void calling() {
		System.out.println("I am calling method of State");
	}
}
class City extends State1{
	//default constructor with default super()
	void printing() {
		System.out.println("I am print method");
	}
}
public class Example2 {

	public static void main(String[] args) {
		City s1=new City();
		s1.display();
		s1.calling();
		s1.printing();
	}
}
/**
in order to achieve inheritance we need constructor chaining-

constructor chaining- when subclass constructor calls super class constructor and 
						super class constructor calls its super class constructor dn its 
						known as constructor chaining
to achieve constructor chaining we need to user super().

super() is used to call parent class constructor based on parameter
super() should be the first statement inside the constructor body
*/