package day4.operators;

public class UnaryOp01 {

	public static void main(String[] args) {
		int x=5,y;
		//Decrement --> pre-Decrement--> first perform ops dn use updated value
		y=--x; //y =--x; --->x=x-1;		
		System.out.println("x: "+x);//
		System.out.println("y: "+y);//
		System.out.println("====================");
		x=10;
		//Decrement --> post-Decrement--> first use value and dn perform ops
		y=x--;
		System.out.println("x: "+x);//
		System.out.println("y: "+y);//
	}

}
