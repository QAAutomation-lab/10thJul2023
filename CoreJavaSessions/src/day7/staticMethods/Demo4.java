package day7.staticMethods;

import day18.arrays.CheckArrayElements;

public class Demo4 {

	static int age=25;
	public static void main(String[] args) {
		//you will be able to execute method body but you won;t be able to use its return value
		calculateSimlpeInt(10000, 7.5, 60);
		//you will be able to execute method and also you will printing its return value
		System.out.println("Simple Interest is: "+calculateSimlpeInt(50000, 6, 60));
		//you will be able to execute method and also you have stored its return value for future use
		double ints=calculateSimlpeInt(50000, 8.5, 72);
		System.out.println("interest: "+ints);
		double finalAmount=50000+ints;
		System.out.println("Final Amount: "+finalAmount);
	}
	
	//(p*r*n)/100
	static double calculateSimlpeInt(int p,double r,int n) {
		double result;
		result=(p*r*n)/100;
		System.out.println("p : "+p);
		System.out.println("r : "+r);
		System.out.println("n : "+n);
		System.out.println("result : "+result);
		return result;
	}
	
	//WAP to get reverse number for given number
	static int getReverseNumber(int num) {
		/**
		 * int num=123,rev=0,rem;
		 * rem=num%10; ---> 123%10=3
		 * rev=rev+rem;---> 0+3=3
		 * num=num/10; ---> 123/10=12
		 */
		int rev=0,rem;
//		while(num>0) { // 123>0 		| 12>0     | 1>0  | 0>0
//			rem=num%10; //---> 123%10=3 | 12%10=2  | 1%1=1
//			rev=rev*10+rem;//->0*10+3=3 | 3*10+2=32| 32*10+1=321
//			num=num/10;// ---> 123/10=12| 12/10=1  | 1/1=0
//		}
		for(;num>0;) {
			rem=num%10; //---> 123%10=3 | 12%10=2  | 1%1=1
			rev=rev*10+rem;//->0*10+3=3 | 3*10+2=32| 32*10+1=321
			num=num/10;// ---> 123/10=12| 12/10=1  | 1/1=0
		}
		return rev;
	}
	
	//WAP to check given number is prime of not
	static boolean checkPrimeNumber(int num) {
		//TODO: fill the logic
	}
}
