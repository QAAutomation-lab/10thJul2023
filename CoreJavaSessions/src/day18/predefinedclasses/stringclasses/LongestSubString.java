package day18.predefinedclasses.stringclasses;

import java.util.HashMap;

public class LongestSubString {

	public static void main(String[] args) {
		String str="StringSalsa";
		getLongestSubstring(str);
	}
	
	static void internMethod() {
		String s1=new String("Pune");
		//s1 will start pointing to String constant pool object instead of non-constant pool
		s1=s1.intern();
	}
	
	public static void getLongestSubstring(String s1) {
		char[] charArray=s1.toCharArray();
		String temp="";
		int count=0;
		HashMap<Character,Integer> charMap=new HashMap<Character,Integer>();
		for(int i=0;i<charArray.length;i++) {
			char ch=charArray[i];//S,t,r,i,n,g,S
			if(!charMap.containsKey(ch)) {//
				charMap.put(ch, i);//S=0,t=1,r=2,i=3
			}else {
				i=charMap.get(ch);
				charMap.clear();
			}
			if(charMap.size()>count) {
				count=charMap.size();//1,2,3,4
				temp=charMap.keySet().toString();//S,t,r,i
			}
		}
		System.out.println("Actutal String : "+s1);
		System.out.println("Longest subString: "+temp);
		System.out.println("size for longest subString: "+count);
	}
}
