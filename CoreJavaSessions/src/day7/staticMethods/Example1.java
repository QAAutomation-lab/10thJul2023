package day7.staticMethods;
public class Example1 {
	
	public static void display() {
		System.out.println("Hi, I am shailesh");
		System.out.println("You are learning Core-Java");
		System.out.println("My contact number is 9764975157");
	}	
	static void showDetails(String name,char grade,int num) {
		System.out.println("Hi, I am "+name);
		System.out.println("Your grade is "+grade);
		System.out.println("My contact number is "+num);
	}
	static void addNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		System.out.println("Result is : "+res);
	}
	static void addTwoNumbers(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		System.out.println("Result is : "+res);
	}
	public static void main(String[] args) {
		display();
		//System.out.println(display());// you will get compile time error method return type is void
		Example1.display();
		//while calling parameterize method pass the value based on datatype
		showDetails("Ashish", 'A', 98875424);
		showDetails("Nikita", 'O', 354657);
		System.out.println("***********************************");
		addNumber();
		addTwoNumbers(10, 70);
		addTwoNumbers(-10, 50);
	}
}
/*
void: when you want to just print the result in the console and you don;t its value
parameter/argument: when you want to run your method with different data values
*/




