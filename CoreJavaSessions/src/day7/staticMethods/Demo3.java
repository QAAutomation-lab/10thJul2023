package day7.staticMethods;

import day18.arrays.CheckArrayElements;

public class Demo3 {

	public static void main(String[] args) {
		checkPrimeNumberRange(21, 75);
	    // checkEvenOdd(15);
	    // Demo3.checkEvenOdd(30);
	     //can we call void method from println()?
	     //No, we can't call any method with return type as void inside println() because it won;t return any value
	     //System.out.println(checkEvenOdd(25));
	}
	//WAP to check given number is even/odd
	public static void checkEvenOdd(int num) {
		if(num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	//WAP to print Pune details
	static void displayPuneDetail() {
		//TODO: fill the logic
	}
	//WAP to check given number is prime of not
	static void checkPrimeNumber(int num) {
		/**
		 * number which can be divided twice either by 1 or itself 
		 * int num=5;
		 */
		int ct=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					ct++;
				}
			}
		}else {
			System.out.println("Either given number is 1 or below 1");
			
		}	
		if(ct==2) {
			System.out.println("Given number is prime");
			
		}else {
			System.out.println("Given number is not prime");
		}
	}
	
	static void checkPrimeNumberRange(int start,int end) {
		/**
		 * number which can be divided twice either by 1 or itself 
		 * int num=5;
		 */
		for(;start<=end;start++)
		{
			int ct=0;
			if(start>1) {
				for(int i=1;i<=start;i++) {
					if(start%i==0) {
						ct++;
					}
				}
			}else {
				System.out.println("Either given number is 1 or below 1");
				
			}	
			if(ct==2) {
				System.out.println("Given number is prime: "+start);
				
			}else {
				System.out.println("Given number is not prime: "+start);
			}
		}
	}
	
	//WAP to calculate simple interest
	//TODO: fill the logic
}
