package day3.variabletypes;

public class Variable1 
{
	//global variable
	int num1;//non-static global variable
	static double res;//static global variable
	public static void main(String[] args) {
		//local variable
		int age=25;
		double salary=15000;
		System.out.println("age: "+age);
		System.out.println("Salary: "+salary);//error: before salary variable is not initialized
	}
}
/*
 * Local variable: variable declared inside method/constructor/block body known as local variable, 
 * 					we don;t use static keyword with local variable
 * 					these variable should be initialize before we use them
 * 					These variable won't get separate memory for storage
 * 					these variable are not accessible from outside the method/constructor body
 * Global Variable: variable declared outside the method/constructor body but present in class body
 * 					known as global variable
 * 		type:
 * 			static global variable: 
 * 			non-static global variable:
 */
