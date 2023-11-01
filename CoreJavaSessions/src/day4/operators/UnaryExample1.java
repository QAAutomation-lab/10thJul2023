package day4.operators;

public class UnaryExample1 {

	public static void main(String[] args) {
		int n1=10,n2;
		n2=n1;
		System.out.println("Number1: "+n1);
		System.out.println("Number2: "+n2);
		
		n1=++n2;//pre-increment ----> first perform the operation dn use the updated value
		System.out.println("updated Number1: "+n1);
		System.out.println("updated Number2: "+n2);
		
		int x=10,y;
		y=x++;//post-increment ----> First use the value and perform the operation
		System.out.println("y: "+y);
		System.out.println("x: "+x);
		
		int a=20,b;
		b=--a;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		int p=20,q;
		q=p--;
		System.out.println("p: "+p);
		System.out.println("q: "+q);
	}

}
