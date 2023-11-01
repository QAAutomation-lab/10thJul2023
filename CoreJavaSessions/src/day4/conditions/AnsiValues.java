package day4.conditions;

public class AnsiValues {

	public static void main(String[] args) {
		char c1='Z';
		System.out.println("c1: "+c1);
		int num=c1;
		System.out.println("num: "+num);
		
		
		int num1=10,num2=20,temp;
		System.out.println("**********Before swapping*************");
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		temp=num1+num2;
		num1=temp-num1;
		num2=temp-num1;
		System.out.println("**********After swapping*************");
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		
		System.out.println("****************************************");
		char c2='a';
		if(c2=='a') {
			
		}else if(c2=='e') {
			
		}else if(c2=='i') {
			
		}else if(c2=='o') {
			
		}else if(c2=='u') {
			
		}else {
			
		}
		
		if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u') {
			
		}else {
			
		}
		
		System.out.println("*************************************");
		int n1=10,n2=5,n3=15;
		if(n1>=n2 && n1>=n3) {
			System.out.println("Largest number is n1:"+n1);
		}else if(n2>=n1 && n2>=n3) {
			System.out.println("Largest number is n2:"+n2);
		}else {
			System.out.println("Largest number is n3:"+n3);
		}
	}

}
