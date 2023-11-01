package day16.typecasting;

public class Example2 {

	public static void main(String[] args) {
		int num1=25,num2=5;
		
		double result=num1/num2;//implicit/auto widening
		
		double result1=(double)num1/num2;//explicit widening
		
		int res=(int)result*num2;//explicit narrowing

	}

}
