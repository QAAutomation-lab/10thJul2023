package day11.inheritances;
class Bank{	
	int numberOfAccountTypeAvailable=2;
	double homeLoanRoi() {
		return 6.5;
	}	
}
class SBI extends Bank{
	int numberOfAccountTypeAvailable=5;
	double homeLoanRoi() {
		return 9.5;
	}
	void accontType() {
		System.out.println("Saving...");
		System.out.println("SBI numberOfAccountTypeAvailable: "+numberOfAccountTypeAvailable);
		
//		Bank b1=new Bank();
//		System.out.println("Bank numberOfAccountTypeAvailable: "+b1.numberOfAccountTypeAvailable);
		System.out.println("Bank numberOfAccountTypeAvailable: "+super.numberOfAccountTypeAvailable);
		System.out.println("SBI homeLoanRoi: "+homeLoanRoi());
		System.out.println("Bank homeLoanRoi: "+super.homeLoanRoi());
	}
}
public class SuperKeywordExample1 {
	public static void main(String[] args) {
		SBI s1=new SBI();
		s1.accontType();
	}
}
/*
super: keyword is known as parent/super class instance

used mainly when super and sub class are having common non-static member to differenced them we use 
super keyword

*/