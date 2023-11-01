package day18.arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int n[]= {10,2,3,45,-5,6,-7};
		System.out.println(get2ndSmallestNumber(n,5));
	}
	static int get2ndSmallestNumber(int num[], int smallestNum) {
		int temp;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		return num[smallestNum];
	}
}
