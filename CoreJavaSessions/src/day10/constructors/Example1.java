package day10.constructors;

public class Example1 {

	double salary;
	public static void main(String[] args) {
		Example1 obj=new Example1();
		obj.display();
		obj.show(55000.56);
	}
	
	void display() {
		System.out.println("I am display method of Example1");
		System.out.println("NSGB salary: "+salary);
	}
	
	void show(double sal) {
		System.out.println("Local variable : "+sal);
		System.out.println("NSGB salary: "+salary);
		double salary=25000.56;
		System.out.println("local salary: "+salary);//25000.56
//		Example1 e1=new Example1();
//		System.out.println("NSGV salary: "+e1.salary);	
		//or
		System.out.println("NSGV salary: "+this.salary);
	}
}
/*
 this: is know as current class instance,
 		can be used only inside non-static method/constructor
 		use to access only non-static member(variable and method)
 		mainly used when local variable of non-static method and NSGV variable name are same
 */
