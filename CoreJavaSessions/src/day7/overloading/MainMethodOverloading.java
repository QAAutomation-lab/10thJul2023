package day7.overloading;

class MainMethodOverloading {
	
	public static void main(int a) {
		System.out.println("I am main(int)");
	}	
	public static void main(float a) {
		System.out.println("I am main(float)");
	}	
	public static void main(String[] args) {
		main(12);
		MainMethodOverloading.main(2.5f);
	}	
}
class Sample1{
	
	public static void main(String[] args) {
		MainMethodOverloading.main(12);
		MainMethodOverloading.main(2.5f);
	}	
}

