package day7.thiskeywords;
class Example1 {	
	static int num1=10,num2=20, result;
	static int addNumbers() {
		System.out.println("global Num1: "+num1);//10
		System.out.println("global Num2: "+num2);//20
		result =num1+num2;
		return result;
	}
	static int addNumbers(int num1,int num2) {
		System.out.println("local Num1: "+num1);
		System.out.println("local Num2: "+num2);
		System.out.println("Global Num1: "+Example1.num1);
		System.out.println("Global Num2: "+Example1.num2);
		result =num1+num2;
		return result;
	}
	public static void main(String args[]) {	
		System.out.println("Addition of two numbers: "+addNumbers());
		System.out.println("Addition of two numbers: "+addNumbers(25,75));
	}
}
/*
when static global variable name and static method local variable name are same 
dn to diffirenciate them we use classname to access  static global varibale
*/