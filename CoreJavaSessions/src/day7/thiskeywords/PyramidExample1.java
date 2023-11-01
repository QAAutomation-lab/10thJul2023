package day7.thiskeywords;

public class PyramidExample1 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {//number of line in pyramid
			for (int j = 0; j <= i; j++) {//gives you the require pattern
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		for (int i = 5; i >=0; i--) {//number of line in pyramid
			for (int j = 0; j<=i; j++) {//gives you the require pattern
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}