package day3.variabletypes;
public class StaticGlobalVariableExample6 {
	//static global  variables
	static double res;
	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1=25,num2=5;
		res=num1*num2;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("result: "+res);
		
		res=num1/num2;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("result: "+res);
		
		res=num1%num2;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("result: "+res);
		
		num1=37;
		res=num1%num2;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("result: "+res);
		
		System.out.println("Program ends");
	}
}
/**
any variable declared outside the method body but declared in class body known as Global variable
- if its declared with static keyword dn it will known as static global variable
- static global variables are also known as 'class variable/class member'
	- these variable will be loaded in the memory at the time of compilation when a class file if generated
	- in order access static global variable we can use-
		- we can access static global variable from another static method directly
		- standard -we can access static global variable using class name as they are class member for example:
				classname.staticglobalvariablename
- if we declare any global variable but not initialized and trying used it dn it will give you default value based on data type
- static member will have single memory allocation throughout the execution hence any change in its value will have
	impact the original value
*/