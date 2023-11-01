package oopsrevision;
class Testing2{
	public static void main(String[] args) {
		Example3 e1=new Example3();
		//System.out.println(e1.age);
		System.out.println(e1.empId);
	}
}
public class Example3 {
	private int age=25;
	int empId=10;
	protected double salary=250000.56;
	public char grade='A';
	public static void main(String[] args) {
		Example3 e1=new Example3();
		System.out.println("age: "+e1.age);
		System.out.println(e1.salary);
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
}
/*
class/interface --> public & default
method/variable/constructor --> private, default, protected, public
*/