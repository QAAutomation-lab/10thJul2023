package day18.predefinedclasses.stringclasses;

public class Sample2 {

	public static void main(String[] args) {
		
		String s1="Bangalore is IT hub, Pune is also known for IT and Nature";
		String[] strArray1=s1.split(" ");
		for(String str1:strArray1) {
			System.out.println(str1);
		}
		System.out.println("**************************");
		String[] strArray2=s1.split(" ",3);
		for(String str1:strArray2) {
			System.out.println(str1);
		}
		System.out.println("***************************");
		String s2="      Welcome to Java programming                    ";
		System.out.println("s2 lenght: "+s2.length());
		System.out.println("s2: "+s2);
		System.out.println("s2 lenght without space in pre/post: "+s2.trim().length());
		System.out.println("s2: "+s2.trim());
		System.out.println("***********************");
		String s3="I am staying In Pune";
		System.out.println("s3: "+s3);
		System.out.println("s3 in lowercase: "+s3.toLowerCase());
		System.out.println("s3 in uppercase: "+s3.toUpperCase());
	}

}
/*
Object using literal:
	Unique object will be created inside String Constant pool area of heap
	
	-in String class following methods are overrided
		toString()--> given value store inside the object
		equals(Object obj) ---> compare two objects based on value not address
		== ---> compare two objects based on Address not value


*/