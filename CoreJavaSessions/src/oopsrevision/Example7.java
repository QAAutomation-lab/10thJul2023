package oopsrevision;

public class Example7 {

	public static void main(String[] args) {
		int[][] empDetails=new int[3][2];
		
		System.out.println("row count: "+empDetails.length);
		System.out.println("row0 col count: "+empDetails[0].length);
		
		empDetails[0][0]=10;
		empDetails[0][1]=20;
		empDetails[1][0]=30;
		empDetails[1][1]=40;
		empDetails[2][0]=50;
		empDetails[2][1]=60;
		
		for(int i=0;i<empDetails.length;i++) {
			for(int j=0;j<empDetails[i].length;j++) {
				System.out.print(empDetails[i][j] +" ");
			}
			System.out.println();
		}

	}

}
