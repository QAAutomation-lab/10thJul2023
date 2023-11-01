package day13.pack1;

public class Modifiers {

	private int num1 = 10;	//Accessible within a class
	int num2 = 20;			//Accessible within a package
	protected int num3 = 30;//Accessible within a package and class accessible from outside the package using inheritance
	public int num4 = 40;//Accessible within a package and also can be access from anywhere but class should be declared as public

	public static void main(String[] args) {

		Modifiers m1 = new Modifiers();
		System.out.println("private variable: " + m1.num1);
		System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);
	}
}
class AccessModifiers{
	public static void main(String[] args) {

		Modifiers m1 = new Modifiers();
		//System.out.println("private variable: " + m1.num1);
		System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);
	}
}
