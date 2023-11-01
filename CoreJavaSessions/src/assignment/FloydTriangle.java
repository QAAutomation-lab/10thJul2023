package assignment;

public class FloydTriangle {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<5;i++) {//number of rows
			for(int j=1;j<=i;j++) {//pattern to print
				System.out.print(k+"  ");
				k++;
			}
			System.out.println();
		}
	}

}
