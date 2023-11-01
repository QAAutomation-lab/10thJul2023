package day7.staticMethods;

public class Sample1 {

	static void display() {
		System.out.println("You can call me on 9764975157");
	}
	static void calling(int num) {
		System.out.println("You can call me on "+num);
	}
	//i=(p*n*r)/100;
	static double getInt(int p,int n,double r) {
		System.out.println("p: "+p );
		System.out.println("n: "+n);
		System.out.println("r: "+r);
		double res=(p*r*n)/100;
		return res;
	}
	
	static void checkEvenOddNum(int num) {
		if(num%2==0) {
			System.out.println("Given number is even");
		}else {
			System.out.println("Given number is odd");
		}
	}
	
	static int getLargestNumber(int n1,int n2,int n3) {
		int res;
		if(n1>n2 && n1>n3) {
			res=n1;
		}else if(n2>n1 && n2>n3) {
			res=n2;
		}else {
			res=n3;
		}
		return res;
	}
	public static void main(String[] args) {
		
		System.out.println("Largest number is: "+getLargestNumber(15, 5, 50));
		
		checkEvenOddNum(50);
		
		System.out.println(getInt(550000, 60, 7.5));
		
		double amount=getInt(550000, 60, 7.5);
		System.out.println("Amount: "+amount);
		//2% discount
		double discountedAmount=amount-(amount*2)/100;
		System.out.println("discountedAmount: "+discountedAmount);
		
		display();
		display();
		display();
		display();
		calling(12345);
		calling(65478);
		calling(10000);
		calling(55555);
	}

}

/*
 * method with return type ---> paramter --> NO
 * method with return type ---> paramter --> Yes
 * method without return type ---> paramter --> No
 * method without return type ---> paramter --> Yes
 */
