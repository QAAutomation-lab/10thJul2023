package day10.constructors;

public class All_In_One2 {
	int age;
	double salary;
	All_In_One2(){
		System.out.println("zero-param cons is started");
		System.out.println("zero-param cons is ended");
	}
	All_In_One2(int i){
		System.out.println("int-param cons is started");
		age=i;
		System.out.println("int-param cons is ended");
	}
	All_In_One2(double i){
		System.out.println("double-param cons is started");
		salary=i;
		System.out.println("double-param cons is ended");
	}
	All_In_One2(int x,double y){
		System.out.println("int-double-param cons is started");
		age=x;
		salary=y;
		System.out.println("int-double-param cons is ended");
	}
	public static void main(String[] args) {
		System.out.println("********************new NSGV***********************");
		All_In_One2 ref1=new All_In_One2();
		System.out.println("age with ref1: "+ref1.age);
		System.out.println("salary with ref1: "+ref1.salary);
		System.out.println("****************************************");
		All_In_One2 ref2=new All_In_One2(25);
		System.out.println("age with ref2: "+ref2.age);
		System.out.println("salary with ref2: "+ref2.salary);
		System.out.println("****************************************");
		All_In_One2 ref3=new All_In_One2(25.56);
		System.out.println("age with ref3: "+ref3.age);
		System.out.println("salary with ref3: "+ref3.salary);
		System.out.println("****************************************");
		All_In_One2 ref4=new All_In_One2(30,25.56);
		System.out.println("age with ref4: "+ref4.age);
		System.out.println("salary with ref4: "+ref4.salary);
	}
}
/*
local variable
Global variable
Method--> static / non-static
Method overloading
Constructor 
Constructor overloading
*/