package oopsrevision;
class Fruit{
	void shape() {
		System.out.println("Fruit shape is round");
	}
	void color() {
		System.out.println("Fruit color is green");
	}
}
class Apple extends Fruit{
	void taste() {
		System.out.println("Apple is sweet");
	}
	@Override
	void color() {
		System.out.println("Apple is Red");
	}
}
public class Example4 {

	public static void main(String[] args) {
		Fruit f1=new Apple();
		f1.shape();
		f1.color();
		
		//Apple a1=new Apple();
		Apple a1=(Apple)f1;//downcasting
		a1.color();
		a1.shape();
		a1.taste();
	}

}
