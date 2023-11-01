package day7.thiskeywords;

class FinalKeyword0 {
	
	public static void main(String args[]) {

		int age=20;
		System.out.println("age: "+age);
		age=25;
		System.out.println("1st change in age: "+age);
		age=30;
		System.out.println("2nd change in age: "+age);
		age=34;
		System.out.println("3rd change in age: "+age);
		
		final double sal;
		sal=25000.56;
		System.out.println("Salary: "+sal);
		
		//sal=50000;//you will get compile time error as its declared as final
	}
}
/*
Local variable can be declared as final and value needs to initialize before its use

*/