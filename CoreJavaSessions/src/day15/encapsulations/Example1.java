package day15.encapsulations;

class Encap {
	private int age=25;
	private double salary=25000.65;
	/*
	 * Getter: public method with return type as required private variable type and no argument 
	 * access modifier: public
	 * non-access modifier: non-static
	 * return type: as required variable datatype
	 * method name: valid identifier
	 * argument:no
	 * return value: required private variable
	 */
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	/*
	 * Setter: public method with void return type
	 * access modifier: public
	 * non-access modifier: non-static
	 * return type: void
	 * method name: valid identifier
	 * argument: should be same as require private variable datatype
	 * return value: no
	 */
	public void setAge(int age) {
		this.age=age;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}

public class Example1 {

	public static void main(String[] args) {
		Encap e1=new Encap();
//		System.out.println(e1.age); // private members are not accessible from outside the class
//		System.out.println(e1.salary);
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
		e1.setAge(35);
		e1.setSalary(55000.56);
		
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
	}
}
