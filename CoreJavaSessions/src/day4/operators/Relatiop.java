package day4.operators;

public class Relatiop {

	public static void main(String[] args) {
		// Variables Definition and Initialization
		int num1 = 5, num2 = 55;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		// is equal to
		boolean res = (num1 == num2);
		System.out.println("num1 == num2 = " + res);// 
				//or
		System.out.println("num1 == num2 = " + (num1 == num2));//
		// is not equal to
		System.out.println("num1 != num2 = " + (num1 != num2));// 
		// Greater than
		System.out.println("num1 >  num2 = " + (num1 > num2));// 
		// Less than
		System.out.println("num1 <  num2 = " + (num1 < num2));// 
		// Greater than or equal to
		System.out.println("num1 >= num2 = " + (num1 >= num2));// 
		// Less than or equal to
		System.out.println("num1 <= num2 = " + (num1 <= num2));// 
	}
}
//All relational operator will give you the result in form of true or false(boolean)
/*
Debug: this will help you to execute your program line by line.
	steps:
		1. add breakpoint into the required line
		2. run the program in debug mode(F11/Run ---> Debug/ Right click on a file, goto debug as and select Java App)
		3. F6--> for next line
		   F5--> to inside the method/function
		   ctrl+shft+i ---> get value of a variable or operation
		   F8 ---> to continue the program execution
*/