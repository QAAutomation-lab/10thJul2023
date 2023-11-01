package day7.thiskeywords;
class Example3 {	
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
		System.out.println("**********Calling another non-static method************");
//		System.out.println("Addition of two numbers: "+addNumbers());
//		System.out.println("Addition of two numbers: "+addNumbers(75,35));
					//or
		System.out.println("Addition of two numbers: "+this.addNumbers());
		System.out.println("Addition of two numbers: "+this.addNumbers(75,35));
		
	}
	public static void main(String args[]) {
		Example3 e1=new Example3();
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