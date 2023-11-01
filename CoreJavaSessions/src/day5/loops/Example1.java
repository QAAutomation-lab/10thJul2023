package day5.loops;

public class Example1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("*******************");
		int num=1;
		while(num<=5) {
			System.out.println(num);//1
			num++;
		}
		System.out.println("*****************");
		int x=1;
		do {
			System.out.println(x);
			x++;
		}while(x<5);
	}
}
