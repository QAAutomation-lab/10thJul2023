package day20.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DupElement {

	public static void main(String[] args) {

		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(10);
		l1.add(30);
		System.out.println(l1);
		
		Set<Integer> se=new HashSet<Integer>(l1);
		System.out.println(se);
		
		Iterator<Integer> itr=se.iterator();
		for(int i=0;i<se.size();i++) {
			int num=itr.next();
			System.out.println(num +" count: "+Collections.frequency(l1, num));
		}
		
		//map to store elements based on there repetition
		Map<Integer,Integer> map=new HashMap();
		
		for(int i=0;i<se.size();i++) {
			//with the help of iterator get one by one element from set
			int num=itr.next();
			//to count each element occurrence 
			int count=0;
			//from the list get one by one element and compare with Set element
			for(int j=0;j<l1.size();j++) {
				if(l1.get(j)==num) {
					count++;
				}
			}
			//update set element as key and occurrence as value
			map.put(num, count);
		}
		System.out.println(map);
	}

}
