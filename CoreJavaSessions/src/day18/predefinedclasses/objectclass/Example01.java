package day18.predefinedclasses.objectclass;

public class Example01{
	@Override
	public String toString() {
		return "Pune";
	}
	@Override
	public int hashCode() {
		return 101;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	public static void main(String[] args) {
		Example01 e1=new Example01();
		System.out.println("e1 with implicit toString() call: "+e1);//java compiler will call toString() of object class to print the in String form
		System.out.println("e1 with explicit toString() call: "+e1.toString());
		System.out.println("e1: integer value of hexadecimal address: "+e1.hashCode());
		
		Example01 e2=new Example01();
		System.out.println("e2 with implicit toString() call: "+e2);
		System.out.println("e2: integer value of hexadecimal address: "+e2.hashCode());
		
		System.out.println("is e1 and e2 object same? "+e1.equals(e2));//compare two objects based on address
		Example01 e3=e2;
		System.out.println("e3 with implicit toString() call: "+e3);
		System.out.println("is e2 and e3 object same? "+e2.equals(e3));
		System.out.println("Program Ends");
	
	}
}
/**
FQCN: day18.predefinedclasses.objectclass.Example0@jgjgt765767jhgj

Object:
	* predefined class belongs to java.lang package
	* java.lang package by default available in each class so no need to write explicitly
	* also known as parent most class or super most class in java
	* every java class directly or indirectly inherits this class
	* Object is have some useful methods like
	* toString(), hashCode(), equals(), clone...
toString() gives string representation of an object in the form of 
			fullyQualifiedClassName@hexadecimalAddress
			packagename.classname@hexadecimalAddress
			
toString(), hashCode(), equals() ---> all are public method of Object
*/