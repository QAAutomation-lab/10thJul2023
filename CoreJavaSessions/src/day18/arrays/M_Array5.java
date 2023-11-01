package day18.arrays;

import java.util.Arrays;

class M_Array5{

	public static void main(String[] args) {
		
		// declaring a source array
		char[] orgArray = { 'a', 'b','e', 'c', 'd'};
		//duplicate array
		char[] cloneArray=orgArray.clone();
		
		//sorting copyFrom in ascending order
		Arrays.sort(orgArray);
		System.out.println("After sorting original array: ");
		for(char c: orgArray) {
			System.out.print(c +" ");
		}
		System.out.println("\nCloned array: ");
		for(char c: cloneArray) {
			System.out.print(c +" ");
		}
		System.out.println("\n+++++++++++++++++++++++++++++++");
		boolean result=Arrays.equals(cloneArray, orgArray);
		System.out.println(result);
	}
}

