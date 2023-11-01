package day7.staticMethods;

public class Demo2 {

	public static void main(String[] args) {
		Demo2.testaddTwoNumber();
		System.out.println("**************************");
		Demo2.addingTwoNumber(10, 20);
		Demo2.addingTwoNumber(50, 60);
	}
	static void addingTwoNumber(int num1,int num2) {
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
		//return; will written by compiler
	}
	static void testaddTwoNumber() {
		int num1=10,num2=20;
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
	}

}
