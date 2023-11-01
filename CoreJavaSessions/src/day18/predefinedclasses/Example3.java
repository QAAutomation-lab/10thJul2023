package day18.predefinedclasses;
class A{
	int i=50;
	protected void finalize() {
		System.out.println("Overrided finalize method");
	}
}
public class Example3 {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		System.out.println("a1 object value: "+a1);
		System.out.println("a2 object value: "+a2);
		
		a1=a2;
		System.out.println("after assigning a2 into a1, a1 object value: "+a1);
		System.out.println("after assigning a2 into a1, a2 object value: "+a2);
		
		//An object pointed by a1 will become abandoned object
		System.out.println("done");

	}

}
