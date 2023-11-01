package methodExamples;

public class Example1 {

	public static void main(String[] args) {
		
		//printDetails(); //or
		Example1.printDetails();
		additionOfTwoNumbers();
		addTwoNumbers(10, 20);
		addTwoNumbers(75, 25);
		System.out.println("*******************");
		int x=121;
		//reverseNumber(x);//it will execute method body but you won't be able to see/use its return value
		
		//method will be executed and you will be able to print its return value
		//System.out.println("After reverse, number is: "+reverseNumber(x));
		
		//method body will be executed and its return value will be stored in a variable for future use
		int a=123;
		int y=reverseNumber(a);
		System.out.println("Recived reverse number is: "+y);
		System.out.println("is number palindrome? "+(a==y));
	}

	public static int reverseNumber(int num) {//int num=x=121;
		System.out.println("Number to reverse: "+num);
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		//System.out.println("Reverse number is : "+rev);
		return rev;
	}
	
	public static void addTwoNumbers(int num1, int num2) {//int num1=10; int num2=20;
		int res=num1+num2;
		System.out.println("from Parameterized method, Num1: "+num1);
		System.out.println("from Parameterized method, Num2: "+num2);
		System.out.println("from Parameterized method, Result: "+res);
	}
	public static void additionOfTwoNumbers() {
		int num1=10,num2=20,res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Result: "+res);
	}
	public static void printDetails() {
		System.out.println("I am XYZ");
		System.out.println("Learning Core-Java");
		System.out.println("I am also learning Manual Testing");
	}
}
