package day7.thiskeywords;

public class StaticGlobalVariableExample1 {
	static int age=35;
	double salary=45000.56;
	void display(double sal) {
		System.out.println("local salary: "+sal);
//		StaticGlobalVariableExample1 obj=new StaticGlobalVariableExample1();
//		System.out.println("NSGV salary: "+obj.salary);
			//or
		System.out.println("NSGV salary2: "+this.salary);
	}
	public static void main(String[] args) {
		int age=25;
		System.out.println("local age: "+age);
		System.out.println("global SV age: "+StaticGlobalVariableExample1.age);
		
		StaticGlobalVariableExample1 s1=new StaticGlobalVariableExample1();
		s1.display(55000.56);
	}
}
/*
how you will differentiate SVG with static method local variable when they have same name?
SGV should access with classname only

how you will differentiate NSVG with non-static method local variable when they have same name?
1.by using Object
2.by using this keyword

this: this keyword is predefined keyword in java 
	it is also known current class instance/object
	it is use access non-static members(variable/method) of the class
	it can used only inside non-static method
	it is mainly used when NSGV name and non-static method local variable name are same
*/