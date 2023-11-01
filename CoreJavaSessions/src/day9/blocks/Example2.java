package day9.blocks;

public class Example2 {

	{
		System.out.println("I am NSIB-1");
	}

	Example2() {
		System.out.println("I am zero-param cons");
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		Example2 e1 = new Example2();
	}

	static {
		System.out.println("I am SIB-1");
	}

}
