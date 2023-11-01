package day18.predefinedclasses;

public class Example1 {

	public static void main(String[] args) {
		int age=25;
		float roi=7.5f;
		System.out.println("age variable: "+age);
		System.out.println("roi variable: "+roi);
		//boxing operation
		Integer obj1=age;//implicit boxing or auto boxing
		System.out.println("Integer object obj1: "+obj1);		
		Float obj2=new Float(roi);//explicit boxing
		System.out.println("Float object obj2: "+obj2);		
		System.out.println("int variable and Interger object comparision: "+(age==obj1));
		System.out.println("float variable and Float object comparision: "+(roi==obj2));
		
		//Unboxing operation
		int a=obj1.intValue();
		float b=obj2.floatValue();
		System.out.println("variable a: "+a);
		System.out.println("variable b: "+b);
		
		String num="123";
		System.out.println("num: "+num);
		//int result=num+100; // complile time error as we are not allowed to perform any arithmetic operation on String
		int n1=Integer.parseInt(num);
		int result=n1+100; 
		System.out.println("Result: "+result);
	}
}
