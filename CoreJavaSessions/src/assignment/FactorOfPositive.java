package assignment;

public class FactorOfPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * num=15
		 * 
		 * loop-->i=1 to i<= num num%i==0 println(i)
		 */
		//System.out.println(Math.abs(-70));
		factor(-50);
		//printFactorOfNegativeNumber(-15);
	}

	static void factor(int num) {
		if (num > 0) {
			for (int i = 1; i <= num; ++i) {
				if (num % i == 0) {
					System.out.print(i + ", ");
				}
			}
		} else {
			for (int i = num; i <= Math.abs(num); ++i) {
				if (i == 0) {
					continue;
				} else {
					if (num % i == 0) {
						System.out.print(i + ", ");
					}
				}
			}
		}
		System.out.println();
	}
	
	static void printFactorOfPositiveNumber(int num) {
		for (int i = 1; i <= num; ++i) {
				if (num % i == 0) {
					System.out.print(i + ", ");
				}
		}
	}
	static void printFactorOfNegativeNumber(int num) {
		for (int i = num; i <= Math.abs(num); ++i) {
			if (i == 0) {
				continue;
			} else {
				if (num % i == 0) {
					System.out.print(i + ", ");
				}
			}
		}
	}
}
/**
5=1,5
-5=-5,-1,1,5

-5,-4-3-2-10
*/
