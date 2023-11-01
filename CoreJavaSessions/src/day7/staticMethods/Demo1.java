package day7.staticMethods;

public class Demo1 {
	static void addingTwoNumber(int num1,int num2) {
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
		return;
	}
	static void addTwoNumber() {
		int num1=10,num2=20;
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
	}
	public static void main(String[] args) {
		addTwoNumber();
		addTwoNumber();
		addTwoNumber();
		System.out.println("**************************");
		addingTwoNumber(10, 20);
		addingTwoNumber(50, 60);
	}


}
