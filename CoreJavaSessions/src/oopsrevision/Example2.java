package oopsrevision;
interface Circle{
	double getAreaOfCircle(int r);//public abstract double getAreaOfCircle(int r);
}
abstract class Bank {
	abstract void calculateInterest(int amount, double roi, int time);
	void homeLoan() {
		System.out.println("you can apply for any loan..");
	}
}
public class Example2  extends Bank implements Circle{
	public double getAreaOfCircle(int r) {
		return 3.14*r*r;
	}
	void calculateInterest(int amount, double roi, int time) {
		System.out.println("Amount: "+amount);
		System.out.println("ROI:" +roi);
		System.out.println("Time: "+time);
		double si=(amount*roi*time)/100;
		System.out.println("Simple interest: "+si);
		
	}
	void homeLoan() {
		System.out.println("I am applying for Personal Loan not Home loan");
	}
	void watchingMovie() {
		System.out.println("I am watching Taare zameen pe...");
	}
	public static void main(String[] args) {
		Example2 e1=new Example2();
		System.out.println(e1.getAreaOfCircle(5));
		e1.homeLoan();
		e1.calculateInterest(450000, 8.5, 2);
		e1.watchingMovie();
		
		Bank b1=new Example2();
		b1.homeLoan();
		b1.calculateInterest(450000, 8.5, 2);
		
		Circle c1=new Example2();
		System.out.println(c1.getAreaOfCircle(6));
	}

}
