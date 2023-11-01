package day18.predefinedclasses.stringclasses;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo s1=new StringDemo();
		System.out.println("s1: "+s1);//
		
		String str1="Pune";
		//toString() method is overrided in String class, so it will value present inside string object
		System.out.println("Str1: "+str1);
		String str2="Pune";
		System.out.println("Str2: "+str2);
		System.out.println("check str1 and str2 contains same value or not? "+str1.equals(str2));
		System.out.println("check str1 and str2 both are same object or not? "+(str1==str2));
		
		String str3="Mumbai";
		System.out.println("Str3: "+str3);
		System.out.println("check str1 and str3 contains same value or not? "+str1.equals(str3));
		System.out.println("check str1 and str3 both are same object or not? "+(str1==str3));
		
		/*in below line two object will be created 
		 * 1. will be created in non-constant pool and referenece variable will point to that object only
		 * 2. will be created(only if its unique) inside the constant pool
		 */
		String str4=new String("Bangalore");
		System.out.println("Str4: "+str4);
		System.out.println("check str1 and str4 contains same value or not? "+str1.equals(str4));
		System.out.println("check str1 and str4 both are same object or not? "+(str1==str4));
		
		String str5=new String("Bangalore");
		System.out.println("Str5: "+str5);
		System.out.println("check str5 and str4 contains same value or not? "+str5.equals(str4));
		System.out.println("check str5 and str4 both are same object or not? "+(str5==str4));
		
		String str6=new String("Pune");
		System.out.println("Str6: "+str6);
		System.out.println("check str1 and str6 contains same value or not? "+str1.equals(str6));
		System.out.println("check str1 and str6 both are same object or not? "+(str1==str6));
		
		String str7="Good Morning";
		System.out.println("Str7: "+str7);
		System.out.println("Char present at index 0: "+str7.charAt(0));
		System.out.println("Char present at index 5: "+str7.charAt(5));
		System.out.println("Count number character present in String: "+str7.length());
		
		for(int i=0;i<str7.length();i++) {
			System.out.println("Char present at index "+i+": "+str7.charAt(i));
		}
	}

}
/**
String-->	
		predefined class in java belongs to java.lang package 
		it represents group/collection of characters
		In String class following methods are overrided
				1. toString() --> instead of printing string representation of object it will print value stored 
								  inside the string object
				2. equals()   ---> overrided, it compare two objects based on there value
				3. ==         ---> overrided, it compares two objects based on there address
		We can create String class object in two ways
			1. by using new keyword
						---> object will be stored in non constant pool
						---> by using this we can have duplicate object also
			2. by using literal 
						---> object will be stored in String constant pool(inside heap)
						---> by using this we can create only unique object inside the pool
*/
