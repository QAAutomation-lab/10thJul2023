package day7.staticMethods;

public class Example2 {		
	
	static int addNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return res;
	}
	static int addTwoNumbers(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return res;
	}
	public static void main(String[] args) {
		
		//it will execute method body but you wont be able to see or use its return value
		addNumber();
		System.out.println("*****************************************");
		//it will execute method body and also prints its return value but you won;t be able to user its return value separately
		System.out.println("Sum of two numbers: "+addNumber());
		//it will execute method body and you can store its return value into a variable for future use
		System.out.println("****************************************");
		int sum=addNumber();
		System.out.println("Result : "+sum);
		int cal=sum+100;
		System.out.println("Updated values: "+cal);
		
		addTwoNumbers(25, 10);//return value won;t be printed, only body will executed
		System.out.println(addTwoNumbers(25, 10));//body and return both will be printed
		int result=addTwoNumbers(25, 10);
		System.out.println("result : "+result);
	}
	
	
}
/**
 * WAP to check given number is prime or not
 * WAP to print even number for given range
 * WAP to check given number is palindrome or not
 * WAP to print the reverse number 
 */




