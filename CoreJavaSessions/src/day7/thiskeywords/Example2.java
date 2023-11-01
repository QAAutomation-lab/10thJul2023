package day7.thiskeywords;
class Example2 {	
	int num1=10,num2=20, result;
	int addNumbers() {
		System.out.println("global Num1: "+num1);//10
		System.out.println("global Num2: "+num2);//20
		result =num1+num2;
		return result;
	}
	int addNumbers(int num1,int num2) {
		System.out.println("local Num1: "+num1);
		System.out.println("local Num2: "+num2);
		
//		Example2 e2=new Example2();
//		System.out.println("Global Num1: "+e2.num1);
//		System.out.println("Global Num2: "+e2.num2);
				//or
		System.out.println("Global Num1: "+this.num1);
		System.out.println("Global Num2: "+this.num2);
		
		result =num1+num2;
		return result;
	}
	void display(int num1,int num2) {
		System.out.println("local Num1: "+num1);//100
		System.out.println("local Num2: "+num2);//200
		System.out.println("Global Num1: "+this.num1);//10
		System.out.println("Global Num2: "+this.num2);//20
		System.out.println("********After update***********");
	  //local=global	
		num1=this.num1;
		num2=this.num2;
		System.out.println("local Num1: "+num1);//10
		System.out.println("local Num2: "+num2);//20
		System.out.println("Global Num1: "+this.num1);//10
		System.out.println("Global Num2: "+this.num2);//20
		
	}
	public static void main(String args[]) {
		Example2 e1=new Example2();
		System.out.println("Addition of two numbers: "+e1.addNumbers());
		System.out.println("Addition of two numbers: "+e1.addNumbers(25,75));
		e1.display(100, 200);
	}
}
/*
when non global variable name and nonstatic method local variable name are same 
dn to differentiate them we use this keyword to access non-static global variable.

this- is known as current class instance
	  it can we used only inside non-static method/constructor 
	  it is used to access any non-static member of the class
	  mainly used to differentiate when non-static global varible and nonstatic method 
	  local variable name are same.
*/