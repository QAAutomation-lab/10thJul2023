package day10.constructors;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Is given number prime? "+isNumberPrime(97));
		printPrimeNumbers(20);
	}
	static void printPrimeNumbers(int num) {
		for(int i=1;i<=num;i++)//this will give you number to check for prime
		{
			//below logic will check whether given number is prime or not
			int ct=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
				{
					ct++;
				}
			}
			if(ct==2)
			{
				System.out.println("Given number is prime: "+i);
			}
		}
	}
	static boolean isNumberPrime(int num) {
		int ct=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				ct++;
			}
		}

		if(ct==2)
		{
			//System.out.println("Given number is prime");
			return true;
		}else{
			//System.out.println("Given number is not prime");
			return false;
		}
	}

}
