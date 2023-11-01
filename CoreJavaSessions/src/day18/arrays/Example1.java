package day18.arrays;

public class Example1 {
	public static void main(String[] args) {
		int num1=10,num2=20,num3=30,num4=40,num5=50;
		
//		int[] num;
//		num = new int[5];
			//or
		int[] num=new int[5];
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		System.out.println("Array element count: "+num.length);
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		for(int i=0;i<num.length;i++)
		{
			//print elements of an array based on index
			System.out.println("Element at "+i+" index: "+num[i]);
		}	
		System.out.println("*************************************");
		int id=101;
		for(int i=0;i<num.length;i++)
		{
			//store elements in the array based on index
			num[i]=id;
			//print elements of an array based on index
			System.out.println("Element at "+i+" index: "+num[i]);
			id++;
		}	
		System.out.println("*************************************");
		boolean status[]= {true,false,true,true,false};
		for(int i=0;i<status.length;i++) {
			System.out.println(status[i]);
		}
		System.out.println("*************************************");
//		for(LHS : RHS)
//		{
//			//RHS should be array name
//			//LHS should be a variable and its type should be same as Array defined in RHS
//		}
		for(int n:num) {
			System.out.println(n);
		}
		
		for(boolean bool:status) {
			System.out.println(bool);
		}
	}
}
