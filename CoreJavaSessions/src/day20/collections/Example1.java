package day20.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Mango");
		l1.add("Banana");
		l1.add("Mango");
		l1.add("Apple");
		l1.add("Mango");
		l1.add("Apple");
		l1.add("Apple");
		Set<String> s1=new HashSet<String>(l1);		
		System.out.println("List: "+l1);
		System.out.println("Set: "+s1);
		Iterator<String> itr=s1.iterator();
		for(int i=0;i<s1.size();i++) {
			String str=itr.next();
			int ct=0;
			for(int j=0;j<l1.size();j++) {
				if(l1.get(j).equals(str)) {
					ct++;
				}
			}
//			System.out.println(str+ " count is: "+ct);
			if(ct>1) {
				System.out.println(str+ " dup count is: "+ct);
			}
		}
	}
}
/*
no index
elements are stored on key-value pair
key and value both should be in form of object
key should be unique and value can be duplicate
to access any value you must have valid key
*/