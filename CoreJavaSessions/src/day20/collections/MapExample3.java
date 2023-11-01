package day20.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample3 {
	public static void main(String[] args) {		
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("key1", "admin");//upcasting
		m1.put("key2", "admin");//upcasting
		m1.put("key3", "admin123");//upcasting
		System.out.println("Map elements are: \n"+m1);
		System.out.println("Map element count: \n"+m1.size());
		System.out.println("*************************************");
		for(Entry pair: m1.entrySet()) {
			System.out.println(pair.getKey()+": "+pair.getValue());
		}				
	}
}
/**
 * to add any element in Map we need use put(key,value) 
 * toString() is overrided here as well
 * to get only keys from map use getKeys()
 * to get only values from Map use values()
 * if you want get a particular Key value dn use get(key)
 */ 
