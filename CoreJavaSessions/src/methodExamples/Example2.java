package methodExamples;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt=450000;
		System.out.println(getHomeLoanInterest(amt, 8.5, 1));
	}

	static double getHomeLoanInterest(int amount,double roi,int duration) {
		double p=(amount*roi*duration)/100;
		return p;
	}
}
/*
WAP for	
		area of circle
		area of triangle
		area of rectangle
*/