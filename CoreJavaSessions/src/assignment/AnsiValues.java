package assignment;

public class AnsiValues {

	public static void main(String[] args) {
		
		for(char c1='a';c1<='m';c1++) {
			int num=c1;
			System.out.println(c1+": "+num);
		}
		
		int num1=15,num2=7,q,r;
		q=num1/num2;
		r=num1%num2;
		
		
		int x=100,y=200,temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println(x);
		System.out.println(y);
		
		int num=10,sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("sum "+sum);
		
		
	}
}
