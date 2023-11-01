package day19.exceptionhandling;
import java.util.Scanner;
public class ExceptionHandling2 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		// 1. abnormal statements
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=scn.nextInt();
		int[] empIds = new int[size];
		try {
			System.out.println("******You are inside try block...**********");
			System.out.println(empIds[3]);// ArrayIndexOutOfBoundsException
			System.out.println("*******Try block ends here...**********");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("#######catch block starts from here..########");
			System.out.println("Exception object: " + e);//java.lang.ArrayIndexOutOfBoundsException: 3
//			System.out.println("Exaption detail by printStackTrace: ");
//			e.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: 3 at day19.exceptionhandling.ExceptionHandling2.main(ExceptionHandling2.java:13)
//			System.out.println("With getMessage: "+e.getMessage());//3
			System.out.println("#########catch block ends from here..##########");
		}
		System.out.println("Programs ends here...");
	}
}
/**
Complete Exception msg:

* if you are printing Exception object reference: 
		java.lang.ArrayIndexOutOfBoundsException: 3

* exceptionRef.getMessage() ---> 3

*if you want actual exception msg:
		exceptionRef.printStackTrace();
		
		java.lang.ArrayIndexOutOfBoundsException: 3
	at day19.exceptionhandling.ExceptionHandling2.main(ExceptionHandling2.java:13)


*/