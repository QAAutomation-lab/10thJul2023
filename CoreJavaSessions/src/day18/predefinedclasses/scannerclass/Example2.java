package day18.predefinedclasses.scannerclass;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		int num1,num2,result;		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number1: ");
		num1=scn.nextInt();
		System.out.println("Enter number2: ");
		num2=scn.nextInt();		
		result=num1+num2;
		System.out.println("Result: "+result);
		char ops;
		System.out.println("Enter operator: ");
		ops=scn.next().charAt(0);
		calculator(num1, num2, ops);
	}
	static void calculator(int num1,int num2,char ops) {
		if(ops=='+') {
			System.out.println("perform addtion");
		}else if(ops=='-') {
			System.out.println("perform substraction");
		}
	}
}
/**
WAP by taking input from Keyboard
	1. reverse number
	2. palindrome number
	3. prime number
	4. even number for given range
	5. smallest element from given array
	6. 2nd smallest element from the array
*/