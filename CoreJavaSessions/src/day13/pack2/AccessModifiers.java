package day13.pack2;

import day13.pack1.Modifiers;

public class AccessModifiers extends Modifiers{
	public static void main(String[] args) {

		AccessModifiers a1=new AccessModifiers();
		//System.out.println("private variable: " + m1.num1);
		//System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + a1.num3);
		System.out.println("public variable: " + a1.num4);
		
		//you can also access public member using -
		Modifiers m1 = new Modifiers();
		System.out.println("public variabl: "+m1.num4);
		//System.out.println("protected variable: " + m1.num3);//not possible
		
	}
}
