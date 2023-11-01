package day7.thiskeywords;

class FinalKeyword02 {
	
	static final int age=10;
	final int empId=101,accNum;
	FinalKeyword02(){
		accNum=135656;
	}
	public static void main(String args[]) {

		final double sal;
		sal=25000.56;
		System.out.println("Salary: "+sal);
		
		System.out.println("Age: " +age);
		FinalKeyword02 f1=new FinalKeyword02();
		System.out.println("empId: "+f1.empId);
		System.out.println("AccNum "+f1.accNum);
		//f1.accNum=1005;
	}
}
/*
final global variable(static/non-static) has be initialize at time of declaration only.
otherwise you will get compile time error

NOTE: non-static member are loaded into the memory at time of object creation 
hence final non-static global variable can be initialize from constructor as well  
*/