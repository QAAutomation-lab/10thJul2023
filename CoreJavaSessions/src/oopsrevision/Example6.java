package oopsrevision;

import java.util.Arrays;

public class Example6 {

	public static void main(String[] args) {
		
//		int[] empId;
//		empId = new int[5];
			//or
		int[] empId = new int[5];
		System.out.println(empId.length);
		//System.out.println(empId[0]);
		
		for(int i=0;i<empId.length;i++) {
			System.out.println(empId[i]);
		}
		empId[0]=10;
		empId[1]=60;
		empId[2]=30;
		empId[3]=70;
		empId[4]=8;
		for(int a:empId) {
			System.out.println(a);
		}
		System.out.println("******** Clone ***************");
		int[] clonedArray=empId.clone();
		for(int a:clonedArray) {
			System.out.println(a);
		}
		System.out.println("*******After sorting *********");
		Arrays.sort(empId);
		for(int a:empId) {
			System.out.println(a);
		}
		System.out.println("**************************");
		for(int i=empId.length-1;i>=0;i--) {
			System.out.println(empId[i]);
		}
		System.out.println("********** Compare two arrays ***********");
		System.out.println("are empId and clonedArray same? "+empId.equals(clonedArray));
		System.out.println("***************cloned Array *************");
		for(int a:clonedArray) {
			System.out.println(a);
		}
		System.out.println("************Copy elements from clonedArray*****************");
		int[] copyArray=Arrays.copyOf(clonedArray, 2);
		for(int a:copyArray) {
			System.out.println(a);
		}
		
		System.out.println("************Copy elements with Range from clonedArray*****************");
		int[] rangeArray=Arrays.copyOfRange(clonedArray, 1, 3);
		for(int a:rangeArray) {
			System.out.println(a);
		}
	}

}
