package day18.predefinedclasses.objectclass;
class Print10 extends Object{	
	int a=10;
	@Override
	public int hashCode() {
		return 101;
	}
	@Override
	public String toString() {
		return "I am Print Class toString";
	}	
	public boolean equals(Object obj) {//Object obj=new Print10();
		Print10 p1=(Print10)obj;
		System.out.println(p1.a);
		System.out.println(this.a);
		return (p1.a==this.a);
	}	
}
public class Example7{

	public static void main(String args[]) {		
		
		Print10 p1=new Print10();
		System.out.println("toString of Print: "+p1);//
		System.out.println("hashCode of Print: "+p1.hashCode());//
		
		Print10 p2=new Print10();
		System.out.println("toString of Print: "+p2);//
		System.out.println("hashCode of Print: "+p2.hashCode());//
		System.out.println("Comparing Print class object p1 & p2 with overriden equals() :"
								+p1.equals(p2));//
	}
}
/*
 *  == --->compare two values
 *  d1.equals(d2) --> compare two objects based on there address
 * 
 */
