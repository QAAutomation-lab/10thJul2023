package oopsrevision;

public class Example5 {

	static void addTwoNumbers(int a,int b) {
		int res=a+b;
		System.out.println("Result: "+res);
	}
	static void addTwoNumbers(double a,double b) {
		double res=a+b;
		System.out.println("Result: "+res);
	}
	public static void main(String[] args) {
		
		addTwoNumbers(10, 30);
		addTwoNumbers(25.2, 10);
	}

}
