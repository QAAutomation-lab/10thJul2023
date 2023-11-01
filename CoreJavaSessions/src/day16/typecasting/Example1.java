package day16.typecasting;
class Starter{
	void idli() {
		System.out.println("Hi,I am Idli");
	}
}
class MainCourse extends Starter{
	void biryani() {
		System.out.println("I am Biryani");
	}
}
public class Example1 extends MainCourse{
	void softDrink() {
		System.out.println("I am softdrink");
	}
	public static void main(String[] args) {
			Example1 e1=new Example1();
			e1.idli();
			e1.biryani();
			e1.softDrink();
			MainCourse m1=new Example1();//auto/implicit up casting
			m1.idli();
			m1.biryani();
			MainCourse m2=(MainCourse)new Example1();//explicit up casting
			m2.idli();
			m2.biryani();
			Starter s1=new Example1();//auto/implicit up casting
			s1.idli();
			Starter s2=(Starter)new Example1();//explicit up casting
			s2.idli();
			
			Starter s3=new MainCourse();//auto/implicit up casting
			Starter s4=(Starter)new MainCourse();//explicit up casting			
	}
}
/*
converting one class object into another class type known as non-primitive/derived casting
	* Inheritance is mandatory
type: 
	1. Up casting ---> child class object is referred by parent class
					a. implicit or auto up casting
					b. explicit up casting
	2. down casting ---> parent class object is referred by child class
			NOTE: downcasting is not possible directly
			* Only upcasted object can be downcasted
*/