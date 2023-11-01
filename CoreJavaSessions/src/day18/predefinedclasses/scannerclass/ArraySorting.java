package day18.predefinedclasses.scannerclass;

public class ArraySorting {

	public static void main(String[] args) {
		int num[]= {10,5,8,15,6};
		int temp;
		for(int i=0;i<num.length;i++) {			
			for(int j=i+1;j<num.length;j++) {				
				if(num[i]>num[j]) {//10>5
					temp=num[i];//temp=10
					num[i]=num[j];//num[0]=5
					num[j]=temp;//num[1]=10
				}
				
			}
		}
		
		for(int n:num) {
			System.out.println(n);
		}

	}

}
