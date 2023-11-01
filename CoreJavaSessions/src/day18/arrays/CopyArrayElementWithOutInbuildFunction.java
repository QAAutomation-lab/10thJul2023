package day18.arrays;

public class CopyArrayElementWithOutInbuildFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] orgArray = { 'a', 'b','e', 'c', 'd'};
		char[] dupArray=new char[orgArray.length];
		
		for(int i=0;i<dupArray.length;i++)
		{
			dupArray[i]=orgArray[i];
		}
		
		for(char c:dupArray) {
			System.out.println(c);
		}
	}
}
/*
 * int num[]={10,20,10,50,40,60,10,20};
 * 10: 3
 * 20: 2
 * 40: 1
 * 50: 1
 * 60: 1
 */
