package day4.operators;

public class UnaryOp1 {

	public static void main(String[] args) {
		int i=10;
		int j=i;
		System.out.println("i: "+i);//
		System.out.println("j: "+j);//
		System.out.println("=====================");
		i=j+40;
		System.out.println("Updated i: "+i);//
		System.out.println("j: "+j);//
		System.out.println("=====================");
		int x=-5,y;
		//Increment --> pre-increment--> first perform ops dn use updated value
		y=++x; //y =++x; --->x=x+1;		
		System.out.println("x: "+x);//
		System.out.println("y: "+y);//
		System.out.println("====================");
		x=10;
		//Increment --> post-increment--> first use value and dn perform ops
		y=x++;
		System.out.println("x: "+x);//
		System.out.println("y: "+y);//
	}

}
