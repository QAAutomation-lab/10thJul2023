package day18.arrays;

import java.util.Arrays;

public class CheckArrayElements {

	public static void main(String[] args) {
		int[] empIds= {1,2,3,4,5,6,7,8,9};		
		
		int[] clonedArr=empIds.clone();
		int[] clonedArr1=Arrays.copyOf(empIds, 2);
		int[] clonedArr2=Arrays.copyOfRange(empIds, 0, empIds.length);
		
		Arrays.sort(clonedArr);
		
		for(int a:empIds) {
			System.out.print(a+",");
		}
		System.out.println();
		for(int a:clonedArr) {
			System.out.print(a+",");
		}
		System.out.println();
		System.out.println(Arrays.equals(empIds, clonedArr));
		
	}

}
