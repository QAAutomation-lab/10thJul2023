package day7.staticMethods;

public class Example7 {

	public static void main() {
		System.out.println("zero-param main");
	}
	public static void main(int i) {
		System.out.println("int-param main");
	}
	public static void main(double d,int a) {
		System.out.println("double-int-param main");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		main();
		main(10);
		main(25.5, 15);
		System.out.println("main method ends");
		
	}

}
