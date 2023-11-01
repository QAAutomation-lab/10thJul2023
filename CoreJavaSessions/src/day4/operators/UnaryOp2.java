package day4.operators;

public class UnaryOp2 {

	public static void main(String[] args) {

		int a = -25, b;
		b = a++;//
		int x = a, y;
		System.out.println(x);//
		y = ++x;// 
		System.out.println(a);//
		System.out.println(b);//
		System.out.println(x);//
		System.out.println(y);//

		int p = 15, q = 30, res;

		res = p++ + --q;
		System.out.println("res: " + res);//
		System.out.println("p: " + p);//
		System.out.println("q: " + q);//
		System.out.println("*****************************");
		int res1 = ++p + ++q;
		System.out.println(res1);// 
		System.out.println("p: " + p);//
		System.out.println("q: " + q);//
	}

}
