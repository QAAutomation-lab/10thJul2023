package day9.blocks;

public class Blocks11 {
	static int age;
	static void print() {
		System.out.println("Age value from print: "+age);
	}
	/* static block or static initialization block or SIB */
	static {
		print();
		System.out.println("******** Running static-block1 of class Blocks1..");
		age=25;
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		System.out.println("I am main() of Blocks1 class...");
		print();
		System.out.println("main() ends");
	}
}
/**
SIB: use to provide some information before we get into actual logic, basically used to initialize static variable of the class
	- it will be executed before main method, as we don't have any name for this
	- without main() SIB won't be executed
block-- no name, no return type, no calling

f6: for next line
f5: to inside method
f8: to continue the flow
 */ 
