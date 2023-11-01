package day5.loops;

public class Sample1 {

	public static void main(String[] args) {
		
		for(int i=1;i<5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("*************************");
		for(int i=1;i<5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("*************************");
		for(int i=1;i<5;i++) //numbers of lines in PYramid
		{
			for(int j=1;j<=i;j++) //design pattern
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("*************************");
		for(char c1='a';c1<'e';c1++) {
			for(char c2='a';c2<=c1;c2++) {
				System.out.print(c1+ " ");
			}
			System.out.println();
		}
		System.out.println("****************************");
		for(int i=4;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*

*/