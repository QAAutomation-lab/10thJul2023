package day18.predefinedclasses.stringclasses;

public class Example1 {

	public static void main(String[] args) {
		String s1="Pune";
		System.out.println("S1: "+s1);
		String s2="Mumbai";
		System.out.println("S2: "+s2);
		System.out.println("s1 and s2 with equals() : "+s1.equals(s2));//f
		System.out.println("s1 and s2 with '==' : "+(s1==s2));//f
		
		String s3="Pune";
		System.out.println("s1 and s3 with equals() : "+s1.equals(s3));//t
		System.out.println("s1 and s3 with '==' : "+(s1==s3));//t
		
		String s4=new String("Mumbai");
		System.out.println("S4: "+s4);
		System.out.println("s2 and s4 with equals() : "+s2.equals(s4));//t
		System.out.println("s2 and s4 with '==' : "+(s2==s4));//f
		
		String s5=new String("Bangalore");
		System.out.println("S5: "+s5);
		System.out.println("s5 and s4 with equals() : "+s5.equals(s4));//f
		System.out.println("s5 and s4 with '==' : "+(s5==s4));//f
		
		String s6=new String("Bangalore");
		System.out.println("S6: "+s6);
		System.out.println("s5 and s4 with equals() : "+s5.equals(s6));//t
		System.out.println("s5 and s4 with '==' : "+(s5==s6));//f
		
		System.out.println("************************************");
		String s7="My name is khan";
		System.out.println("s7: "+s7);
		System.out.println("s7 char count: "+s7.length());
		System.out.println("char at index 3 in S7: "+s7.charAt(3));
		System.out.println("**************************************");
		for(int i=0;i<s7.length();i++) {
			System.out.println("char at index "+i+" in S7: "+s7.charAt(i));
		}
		System.out.println("**************************************");
		for(int i=s7.length()-1;i>=0;i--) {
			System.out.println("char at index "+i+" in S7: "+s7.charAt(i));
		}
		System.out.println("**************************************");
		System.out.println("Original String : "+s7);
		String temp="";
		for(int i=s7.length()-1;i>=0;i--) {
			temp=temp+s7.charAt(i);
		}
		System.out.println("Reverse String : "+temp);
		System.out.println("**************************************");
		String s8="My name is khan and I am an indian";
		System.out.println("s8: "+s8);
		System.out.println("replace all 'a' with 'X' in s8: "+s8.replace('a', 'X'));
		System.out.println("s8: "+s8);
		System.out.println("replace first 'a' with 'X' in s8: "+s8.replaceFirst("a", "X"));
		
		System.out.println("************************************");
		String s9="     Hi, Good evening.           I am Shailesh      ";
		System.out.println("s9: "+s9);
		System.out.println("Char count in s9: "+s9.length());
		System.out.println("exclude preceeding and following spaces from s9: "+s9.trim());
		System.out.println("exclude preceeding and following spaces from s9 and char count: "+s9.trim().length());
		System.out.println("************************************");
		String s10="I am xyz and i am from qpr and I am working in abc";
		System.out.println("s10: "+s10);
		String[] words=s10.split("and");
		for(String str:words) {
			System.out.println(str);
		}
		
		String[] word2=s10.split("am",3);
		System.out.println("*********************************");
		for(String str:word2) {
			System.out.println(str);
		}
	}

}
/*
in String following methods are overrided:
	1. toString()---> it will give value stored inside the object
	2. equals(Object obj) ---> compares two objects based on the value
	3. == ---> compares two objects based on address
	

*/