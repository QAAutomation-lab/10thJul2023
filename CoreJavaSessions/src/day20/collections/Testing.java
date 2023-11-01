package day20.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Testing {

	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(10);//add method is overrided here, it will always keep smallest element in the top
		q1.add(100);
		q1.add(15);
		q1.add(1);
		q1.add(3);
		System.out.println("Queue elements are: "+q1);
		System.out.println("Count of element: "+q1.size());
		
		Iterator<Integer> itr=q1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//it will return null in case queue is empty
		System.out.println("top most element of queue: "+q1.peek());
		//it will throw an exception by name NoSuchElement exception in case queue it empty
		System.out.println("top most element of queue: "+q1.element());
	}

}
