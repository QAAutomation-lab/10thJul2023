package day4.operators;

public class TernaryOps {

	public static void main(String[] args) {
		int num1=1,num2;
//		if(num1==1) {
//			num2=20;
//		}else {
//			num2=30;
//		}
		
		num2=(num1==1)?20:30;
		System.out.println(num2);
		num1=10;
		num2=(num1==1)?20:30;
		System.out.println(num2);
		
		int a=10,b=20,c=30;
		int largestNum=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(largestNum);
	}

}
