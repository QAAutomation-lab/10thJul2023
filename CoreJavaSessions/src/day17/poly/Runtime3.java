package day17.poly;
class Car {
	int price=25000;
	void run() {
		System.out.println("running");
	}
}
class innova extends Car {
	int price =50000;
}
public class Runtime3 {
	public static void main(String args[]) {
		Car c = new innova();
		c.run();
		System.out.println(c.price);//
	}
}