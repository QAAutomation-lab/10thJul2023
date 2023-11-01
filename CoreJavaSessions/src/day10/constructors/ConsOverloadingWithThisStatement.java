package day10.constructors;

class ConsOverloadingWithThisStatement {
	int age;
	double salary;
	ConsOverloadingWithThisStatement() {
		this(10);
		System.out.println("============Zero- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		System.out.println("============Zero- Parameterized Constructor Ends....============");	
	}	
	ConsOverloadingWithThisStatement(int a) {
		this(36.55);
		System.out.println("============int Parameterized Constructor started============");
		System.out.println(" having int parameters");
		age=a;
		System.out.println("============int Parameterized Constructor Ends....============");
	}
	ConsOverloadingWithThisStatement(double b) {
		this(20,36.56);
		System.out.println("============double Parameterized Constructor============");
		System.out.println(" having double parameters");
		salary=b;
		System.out.println("============double- Parameterized Constructor Ends....============");
	}
	ConsOverloadingWithThisStatement(int a, double b) {
		System.out.println("============int-double Parameterized Constructor started============");
		System.out.println(" having int-double parameters");
		age=a;
		salary=b;
		System.out.println("============int-double Parameterized Constructor Ends....============");
	}

	public static void main(String args[]) {
		ConsOverloadingWithThisStatement pc1 = new ConsOverloadingWithThisStatement();
		
	}
}
/**
 * this(): its use to call another constructor of current class based on the parameter
 * 		   it should be used only inside the constructor
 * 		   it should be the first statement inside the constructor body
 */ 
