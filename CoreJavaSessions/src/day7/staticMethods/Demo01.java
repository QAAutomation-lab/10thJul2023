package day7.staticMethods;

public class Demo01 {
	
	public static void main(String[] args) {
		//method calling
		displayDetails();
		Demo01.displayDetails();
	}
	//method declaration and implementation
	static void displayDetails() {
		System.out.println("I am xyz");
		System.out.println("U 20 yrs old");
	}

}
