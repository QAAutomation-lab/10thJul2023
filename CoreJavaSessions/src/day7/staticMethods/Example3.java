package day7.staticMethods;

public class Example3 {
	
	public void display() {
		System.out.println("Hi, I am shailesh");
		System.out.println("You are learning Core-Java");
		System.out.println("My contact number is 9764975157");
	}	
	void addNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		System.out.println("Result is : "+res);
	}
	void addNumber(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		System.out.println("Result is : "+res);
	}
	public static void main(String[] args) {
		//as all the above method are having return type as void, hence they won;t return any value
		Example3 e1=new Example3();
		e1.addNumber();
		e1.addNumber(25, 30);
		e1.display();
	}
}





