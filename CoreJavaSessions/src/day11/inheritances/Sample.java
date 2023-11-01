package day11.inheritances;
class SeleniumDemo{
	void demo() {
		System.out.println("I am SeleniumDemo demo method");
	}
}
public class Sample extends SeleniumDemo{
// Virtual Method/Inherited method: method coming from Super/parent/base class
//	void demo() {
//		System.out.println("I am SeleniumDemo demo method");
//	}
	void calling() {
		System.out.println("calling of Sample..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
