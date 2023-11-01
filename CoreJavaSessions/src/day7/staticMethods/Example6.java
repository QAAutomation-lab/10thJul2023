package day7.staticMethods;

public class Example6 {	
	//global variables
	double result;//non-static global variable
	static double salary;//static global variable
	
	void addTwoNumbers(double num1,int num2) {
		result=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result is: "+result);
	}	
	static double totalSalary(int basic,double ta,int hra) {
		salary=basic+ta+hra;
		System.out.println("Basic Salary is: "+basic);
		System.out.println("TA on Salary is: "+ta);
		System.out.println("HRA on Salary is: "+hra);
		return salary;
	}	
	public static void main(String[] args) {
		System.out.println("initial salary is: "+salary);//	0.0	
		Example6 ref=new Example6();
		System.out.println("result : "+ref.result);	//0.0
		ref.addTwoNumbers(25.5, 15);		
		double grossSalary=totalSalary(27000, 500.56, 1500);
		double ctc=grossSalary+10000;
		System.out.println("Total CTC is: "+ctc);
	}
}
/**
 * when we declare same method multiple times in the same class with different type of parameter 
 * then that this concept is known as method overloading
 *	rule of method overloading:
 *		1. diff in number of argument
 *		2. diff in type of argument
 *		3. diff in position of argument
 *
 *	static/non-static:
 *			way to access
 *			check return type is required or not
 *			check parameter is required or not
 */




