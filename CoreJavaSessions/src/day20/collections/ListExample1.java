package day20.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
				//or
		List l1=new ArrayList();//Inheritance, upcasting and overriding ---> Runtime poly
		System.out.println("is list empty? "+l1.isEmpty());
		System.out.println("List elements are: "+l1);
		
		l1.add("Pune");//converting String to Object using auto upcasting
		l1.add(100);//int to Integer(Auto Boxing), dn Integer to Object(Auto casting)
		l1.add('A');//char to Character, dn Character to Object
		l1.add("Pune");
		l1.add(null);
		System.out.println("List elements are: "+l1);
		System.out.println("List element count is: "+l1.size());
		
		l1.add(1, "Bangalore");
		System.out.println("List elements are: "+l1);
		System.out.println("List element count is: "+l1.size());
		
		l1.set(4, 411015);
		System.out.println("List elements are: "+l1);
		System.out.println("List element count is: "+l1.size());
		
		System.out.println("Element in index 2 from list: "+l1.get(2));
		System.out.println("***********One by One list elements using normal for loop****************");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("***********One by One list elements using normal for-each loop****************");
		for(Object obj:l1) {
			System.out.println(obj);
		}
		System.out.println("***********One by one list elements using Iterator interface********************");
		Iterator itr=l1.iterator();//hasNext(), next(), remove();
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());//java.util.NoSuchElementException
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());
		System.out.println("*********2nd iteration**************");
		//for new iteration create new Iterator instance
		Iterator itr1=l1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
/*
In Collection: 
		toString() method is overriding, so it will print value stored inside the object
		add(Object obj)
		add(int index,Object obj)

*/