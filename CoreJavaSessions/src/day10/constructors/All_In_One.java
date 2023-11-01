package day10.constructors;

public class All_In_One {
	static int num1,num2=20,res;
	int num3=55;	
	public static void displayDetail() {
		System.out.println("Hi, Good evening everyone");
		System.out.println("Welcome to automation session");
		System.out.println("you can contact me on 9764975157");
	}
	public static void displayDetail(String msg,String subject,int num) {
		System.out.println("Hi, "+msg);
		System.out.println("Welcome to "+subject+" session");
		System.out.println("you can contact me on "+num);
	}
	public static void cal(char ops,int num1,int num2) {
		double res;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		if(ops=='+') {
			res=num1+num2;
			System.out.println("result: "+res);
		}else if(ops=='-') {
			res=num1-num2;
			System.out.println("result: "+res);
		}else if(ops=='*') {
			res=num1*num2;
			System.out.println("result: "+res);
		}
	}
	protected boolean checkEvenOdd(int num) {
		if(num%2==0) {
			System.out.println("Given number is even");
			return true;
		}else {
			System.out.println("Given number is odd");
			return false;
		}
	}
	protected boolean checkEvenOdd() {
		int num=25;
		if(num%2==0) {
			System.out.println("Given number is even");
			return true;
		}else {
			System.out.println("Given number is odd");
			return false;
		}
	}
	char getGrade() {
		
		return 'A';
	}
	public static void main(String[] args) {
		System.out.println("********************new NSGV***********************");
		All_In_One ref3=new All_In_One();
		System.out.println(ref3.checkEvenOdd(20));
		boolean result=ref3.checkEvenOdd(25);
		System.out.println("Result is: "+result);
		
		System.out.println(ref3.getGrade());
		char r1=ref3.getGrade();
		System.out.println(r1);
		System.out.println("***********************************");
		cal('*', 25, 10);
		displayDetail();
		displayDetail("Good Morning", "CoreJava", 123);
		int age=25;
		System.out.println("local variable age: "+age);
		System.out.println("********************SGV***********************");
		System.out.println("Static global variable number1: "+All_In_One.num1);
		System.out.println("Static global variable number2: "+All_In_One.num2);
		res=num1+num2;
		System.out.println("Addition of two number is :"+res);
		num1=55;
		System.out.println("updated, Static global variable number1: "+All_In_One.num1);
		System.out.println("Static global variable number2: "+All_In_One.num2);
		res=num1+num2;
		System.out.println("After num1 initialization, Addition of two number is :"+res);
		System.out.println("********************NSGV***********************");
		All_In_One ref1=new All_In_One();
		System.out.println("Non-Static global variable number3: "+ref1.num3);
		ref1.num3=101;
		System.out.println("updated, Non-Static global variable number3: "+ref1.num3);
		System.out.println("********************new NSGV***********************");
		All_In_One ref2=new All_In_One();
		System.out.println("ref2,Non-Static global variable number3: "+ref2.num3);
		
	}
}
/*
local variable
Global variable
Method--> static / non-static
Method overloading
Constructor 
Constructor overloading
this keyword
*/