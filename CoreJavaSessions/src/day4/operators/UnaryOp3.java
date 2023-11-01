package day4.operators;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a = 5, b,x=10,y=20,z=30,p;
		
		p=x+y+z;
		
		b = a++ + ++a + ++a + a;

		System.out.println("a: "+a);//
		System.out.println("b: "+b);//
		
		System.out.println("**********************");
		a = 7;
		b = a-- + --a + --a + a;

		System.out.println("a: "+a);//
		System.out.println("b: "+b);//

		a = -21;
		b = --a + --a + --a + a + ++a + a++;//

		System.out.println(a);// 
		System.out.println(b);// 

		a = -5;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println(a);// 
		System.out.println(b);// 
	}
}
//-4+1
