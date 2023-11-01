package assignment;

public class Example101 {

	public static void main(String[] args) {
		
		for(int i=5;i>0;i--) {//number of lines
			for(int j=1;j<=i;j++) {//define design
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++) {//define patterns
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("================================");
		for(int i=0;i<5;i++) {//number of lines
			for(int j=0;j<i;j++) {//define design
				System.out.print(" ");
			}
			for(int j=i;j<5;j++) {//define patterns
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}














