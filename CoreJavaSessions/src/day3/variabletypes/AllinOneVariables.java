package day3.variabletypes;

public class AllinOneVariables {

	//global variable
	static int empId=10;//static global variable
	double salary;//non-static global variable
	public static void main(String[] args) {
		System.out.println("Programs starts");
		//local variables
		int age=25;
		//access non-static global variable
		AllinOneVariables ref=new AllinOneVariables();
		System.out.println("accessing NSGV from main(): "+ref.salary);
		//access local variable
		System.out.println("accessing local variable: "+age);
		//access static global variable
		System.out.println("Accessing SGV directly from static main(): "+empId);
		System.out.println("Accessing SGV with STD from static main(): "+AllinOneVariables.empId);
		System.out.println("Programs ends");		
	}
}
/*
 * diff: local vs global variable
 * what is class?
 * what is variable?
 * types of variable
 * what is object?
 * why to create object?
 * what is datatype?
 * types of datatype?
 * syntax to compile and execute java program from cmd
 * how to create object?
 * syntax to declare variable?
 * keyword, identifier & literals
 * what is static global variable
 * what is non-static global variable
 */
