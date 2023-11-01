package day7.thiskeywords;

class FinalKeyword1 {
	final int empId=90;
	double salary=34400.67;
	void run() {
		System.out.println("empId: "+empId);
	}
	public static void main(String args[]) {
		FinalKeyword1 obj = new FinalKeyword1();
		obj.run();
		System.out.println(obj.salary);
	}
}

//any global declared as final should be initialize at the same time
//but in case non-static global variable, you initialize its value using constructor or non-static block