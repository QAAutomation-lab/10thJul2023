package day11.overridings;
class Sample1{
	//default constructor
	protected void addition() {
		System.out.println("Addition of two numbers.....");
	}
}
public class Example1 extends Sample1{
	//default constructor with default super()
	@Override
	public void addition() {
		System.out.println("Addition of three numbers.....");
	}
	void multipication() {
		System.out.println("Multipication of two numbers...");
	}
	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.multipication();
		e1.addition();
	}
}
/*
static method--> can;t be overrided --> because they don't participate in inheritance
final method --> can;t be overrided --> because final can't be modify once its declared
private ---> can;t be overrided     --> because these methods are accessible within class only
constructor --> can;t be overrided  --> overloading possible, but not overriding

default ---> yes ----> default/protected/public
protected---> yes ---> protected/public
public---> yes   ----> public

*/