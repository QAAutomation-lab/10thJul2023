package day14.accessmodifiers;

class A {
	private static int data = 40;
	private void msg() {
		System.out.println("Hello java "+data);
	}
}

public class PrivateAccessModifier {
	
	public static void main(String args[]) {
		System.out.println(PrivateAccessModifier.accountNum);
		A obj = new A();
		System.out.println(obj.data);// Compile Time Error
	}
}
/**
private member are accessible with in class only
*/