package day5.loops;

public class PrimeNumberWhile {

	public static void main(String[] args) {
		// prime
		int num = 99, i = 1, counter = 0;
		while (i <= num) {
			if (num % i == 0) {
				counter++;
			}
			i++;
		}
		if (counter == 2) {
			System.out.println("given number is prime: "+counter);
		} else {
			System.out.println("given number is not prime: "+counter);
		}

	}

}
