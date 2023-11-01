package day18.predefinedclasses.stringclasses;
final class TestCase{
	/**
	 * Immutable Class: its value can't be changed, if you change new object will be created
	 * 1. class and data variable should be declared as final
	 * 2. constructor should be parameterized, to initialize final data variable
	 * 3. use only getter method to get final variables value
	 */
	final String name;
	final int age;
	TestCase(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Sample3 {

	public static void main(String[] args) {
		TestCase t1=new TestCase("Pune",25);
		System.out.println(t1.getAge());
		System.out.println(t1.getName());
		//t1.name="Abc";
		
		TestCase t2=new TestCase("Mumbai",50);
		System.out.println(t2.getAge());
		System.out.println(t2.getName());
	}

}
