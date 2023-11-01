package day20.collections;

import java.util.Vector;
public class VectorExample2 {
	public static void main(String args[]) {
		// Create a vector
		Vector<String> vec = new Vector<String>();
		System.out.println("Elements are: " + vec.capacity());
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Lion");
		System.out.println("Elements are: " + vec);	
		System.out.println("After adding 10 Elements capacity is: " + vec.capacity());
		vec.addElement("mat");
		System.out.println("After adding 11th Element capacity is " + vec.capacity());
		System.out.println("Elements are: " + vec);
		for(String str: vec) {
			System.out.println(str);
		}
		//Additional method of vector
		System.out.println("Returns 1st element of Vector: "+vec.firstElement());
		System.out.println("Returns last element of Vector: "+vec.lastElement());
		System.out.println("Last index of Lion object: "+vec.lastIndexOf("Lion"));
	}
}

