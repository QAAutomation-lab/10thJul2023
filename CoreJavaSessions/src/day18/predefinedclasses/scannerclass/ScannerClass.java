package day18.predefinedclasses.scannerclass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		int age;
		double salary;
		String name;
		char grade;
//		// Object creation of Scanner class
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your age: ");
		age=scn.nextInt();		
		System.out.println("Age: "+age);
		System.out.println("Enter your salary: ");
		salary=scn.nextDouble();
		System.out.println("Salary: "+salary);
		System.out.println("Enter your name: ");
		name=scn.next();
		System.out.println("Name: "+name);
		System.out.println("Enter your Grade: ");
		grade=scn.next().charAt(0);
		System.out.println("Grade: "+grade);
		
		int num1,num2;
		char ops;
		System.out.println("Enter your number1: ");
		num1=scn.nextInt();
		System.out.println("Enter your number2: ");
		num2=scn.nextInt();
		System.out.println("Enter your operation: ");
		ops=scn.next().charAt(0);
		System.out.println("Addition of two numbers: "+addNumber(ops,num1,num2));

	}

	static int addNumber(char op, int num1, int num2) {
		if (op == '+') {
			return num1 + num2;
		} else {
			return 0;
		}
	}

}
