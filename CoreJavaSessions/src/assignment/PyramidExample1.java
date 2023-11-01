package assignment;

public class PyramidExample1 {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {//define number of lines in pyramid
			for (int j = 0; j <= i; j++) {//define pattern
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 6; i++) {//define number of lines in pyramid
			for (int j = 0; j <= i; j++) {//define pattern
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 6; i++) {//define number of lines in pyramid
			for (int j = 0; j <= i; j++) {//define pattern
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 6; i >=0; i--) {//define number of lines in pyramid
			for (int j = 0; j <= i; j++) {//define pattern
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++");
		for(char i='a';i<'e';i++) {			
			for(char j='a';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
