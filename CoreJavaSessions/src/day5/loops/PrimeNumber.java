package day5.loops;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 10, count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println("Division count is: "+count);
		if (count == 2) {
			System.out.println("given number is prime");
		} else {
			System.out.println("given number is not a prime");
		}
	}
}
