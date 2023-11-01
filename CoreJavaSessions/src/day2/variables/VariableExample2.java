package day2.variables;
class VariableExample2
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//syntax to declare a variable: datatype variablename;
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVariable;
		char charVariable;
		boolean booleanVariable;		
		//Syntax to initlize a variable: variablename = value;
		byteVariable = 25;//-10 | -89
		shortVariable = 50;//-10 | -89
		intVariable = 150;//-10 | -89
		longVariable = 2530l;//-10 | -89 | 25
		floatVariable = 25.36f;//25 | -69 |5454 | 0.25f
		doubleVariable = 36.56d;//25 | -69 |54.54 | 0.256
		charVariable = 'A';//'a' | 'Z'
		booleanVariable = true;//true | false
		//print all the varibale value inthe console
		System.out.println("byteVariable");
		System.out.println(byteVariable);
		System.out.println(shortVariable);
		System.out.println(intVariable);
		System.out.println(longVariable);
		System.out.println(floatVariable);
		System.out.println(doubleVariable);
		System.out.println(charVariable);
		System.out.println(booleanVariable);
		System.out.println("Program ends");
	}
}
/*
+ ----> Addition
	LHS + RHS ---> if both sides are number dn it will perform addition operation
  number + number=result based on addition
  20 + 30 =50
+ ----> Concatenation
	LHS + RHS ---> If anyone side is String dn it will perform concatenation operation 
 "string" + number=result based on concatenation
 	"Demo"+25=Demo25
 	25+ "Demo"=25Demo
 	
 	"Demo"+25+35=Demo25+35=Demo2535
 	
 	"Testing"+45+10+55=Testing451055
 	
 	"Testing"+(45+10+55)="Tesing"+110=Testing110
 	
 	10+20+30+"ABC"=60ABC
 	
 	int num=123;
 	System.out.println("Hello,My number is: "+num);
*/