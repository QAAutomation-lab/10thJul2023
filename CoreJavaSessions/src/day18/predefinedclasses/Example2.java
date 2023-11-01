package day18.predefinedclasses;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("is given number prime? "+ checkPrime(11, 2));
	}
	
	static boolean checkPrime(int num,int i) {//num=7, i=2
		if(num>=1 && num<=2) {
			return true;
		}
		if(num%i==0) {
			return false;
		}
		if(i*i>num) {
			return true;
		}
		return checkPrime(num,i+1);
	}
}
