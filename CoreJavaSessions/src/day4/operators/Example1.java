package day4.operators;

public class Example1 {

	public static void main(String[] args) {

		int a=10,b;
		b=++a;//pre --> pre-increment
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		int x=15,y;
		y=x++;
		System.out.println("y= "+y);//15
		System.out.println("x= "+x);//16
		
		int c=20,d;
		d=c--;
		System.out.println("d= "+d);//20
		System.out.println("c= "+c);//19
		
		int m=9,n;
		n= m++ + --m + m + m-- + ++m;
//initial= 9   +  9  + 9 + 9   + 9
//final  = 10     9    9   8     9

		System.out.println("n= "+n);//45
		System.out.println("m= "+m);//9

	}

}
/*
pre : 1st Operation --> 2nd use value
post: 1st use value --> 2nd operation

*/