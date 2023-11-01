package day11.overridings;

class Human {
	// Overridden method
	//in overriding we can increase the visibility of overridden method --> default-->protected-->public
	// default ---> default or protected or public
	// protected ---> protected or public
	// public ----> public
	void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human {
	// Overriding method
	public void eat() {
		System.out.println("Boy is eating");
	}
}
class Overriding3 {
	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();
	}
}