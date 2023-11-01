package day18.predefinedclasses.stringclasses;

public class CompareToString {

	public static void main(String[] args) {
		String s1= "Deccan";
		String s2= "Deccan";
		String s3= "Viman";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));

	}

}
/*

s1>s2  --->return positive number
s1<s2 --->return negative number
s1==s1 --->return 0
*/