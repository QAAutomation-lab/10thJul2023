package day7.staticMethods;

public class TestMethod2 {

	static void printDetails() {
		System.out.println("Hello, everyone");
		System.out.println("I am shailesh");
		System.out.println("from Pune");
		System.out.println("Working in IT");
		System.out.println("Staying in Deccan, pune");
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			printDetails();
		}
		System.out.println("**************1******************");
		TestMethod2.printDetails();
//		System.out.println("**************2******************");
//		printDetails();
//		System.out.println("**************3******************");
//		printDetails();
//		System.out.println("**************4******************");
//		printDetails();
//		System.out.println("**************5******************");
//		printDetails();
	}
}
/**
 * variable + method =static member
 * method contains set of repetitive/reusable statements
 * method is used to reduce number of line if they are repetitive
 */ 
