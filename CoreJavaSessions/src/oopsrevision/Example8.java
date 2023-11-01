package oopsrevision;

public class Example8{

	public String toString() {
		return "Hello";
	}
	public int hashCode() {
		return 101;
	}
	
	public boolean equals(Object obj) {
		return true;
	}
	public static void main(String[] args) {
		Example8 e1=new Example8();
		System.out.println(e1);//e1.toString()
		System.out.println(e1.hashCode());
		
		Example8 e2=new Example8();
		System.out.println(e2);
		System.out.println(e2.hashCode());
		
		System.out.println("are e1 and e2 same? "+e1.equals(e2));
		
		Example8 e3=e2;
		System.out.println(e3);
		System.out.println("are e2 & e3 same? "+e2.equals(e3));
	}

}
