package day15.encapsulations;

public class Encap_Example1 {
	private int empId=1001;
	private double salary=65982.55;
	/*
	 * getter: method that help us to access private data members from outside the class
	 *  write a public method with return type as private variable
	 */
	public int getEmpId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	/*
	 * setter: method that help us to modify private data members from outside the class
	 * write a public method with void as a return type and parameter should be same as private variable
	 */	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setSalary(double sal) {
		salary=sal;
	}
}
class UseEncap{
	public static void main(String[] args) {
		Encap_Example1 e1=new Encap_Example1();
		// Private data members are not accessible from outside the class
		//System.out.println(e1.empId);
		//System.out.println(e1.salary);
		
		System.out.println(e1.getEmpId());
		System.out.println(e1.getSalary());
		e1.setEmpId(5001);
		e1.setSalary(2454656.5);
		System.out.println(e1.getEmpId());
		System.out.println(e1.getSalary());
	}
}