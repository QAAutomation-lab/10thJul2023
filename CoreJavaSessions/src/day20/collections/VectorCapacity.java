package day20.collections;

import java.util.Vector;

public class VectorCapacity {
	public static void main(String[] args) {
		Vector v1=new Vector();
		System.out.println("Default capacity of vector: "+v1.capacity());
		System.out.println("Vector element count: "+v1.size());
		v1.setSize(3);
		System.out.println("vector elements are: "+v1);
		System.out.println("Default capacity of vector: "+v1.capacity());
		System.out.println("Vector element count: "+v1.size());
		v1.add("Mumbai");
		System.out.println("vector elements are: "+v1);
		System.out.println("Default capacity of vector: "+v1.capacity());
		System.out.println("Vector element count: "+v1.size());
	}
}


