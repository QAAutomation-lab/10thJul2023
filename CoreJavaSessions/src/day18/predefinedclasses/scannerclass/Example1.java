package day18.predefinedclasses.scannerclass;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		
//		int num1=10,num2=20;
//		int result=num1+num2;
		
		int num1,num2,result;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number1: ");
		num1=scn.nextInt();
		System.out.println("Enter number2: ");
		num2=scn.nextInt();
		result=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+result);
		
		String name;
		double salary;
		char grade;
		System.out.println("Please enter your name");
		name=scn.next();
		System.out.println("Enter your salary");
		salary=scn.nextDouble();
		System.out.println("Enter grade");
		grade=scn.next().charAt(0);
		
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Grade: "+grade);
	}
}
