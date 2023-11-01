package day7.thiskeywords;

public class NonStaticGlobalVariableExample1 {
	int age=35;
	void display() {
		System.out.println("Age from display() "+age);
	}
	void calling(int age) {//int age=25;
		System.out.println("Age from calling() "+age);
//		NonStaticGlobalVariableExample1 n2=new NonStaticGlobalVariableExample1();
//		System.out.println("Age global variable is, using object ref "+n2.age);
				//or
		System.out.println("Age global variable is,using keyword: "+this.age);
	}	
	public static void main(String[] args) {
		NonStaticGlobalVariableExample1 n1=new NonStaticGlobalVariableExample1();
		n1.calling(25);
		n1.display();
	}
}
/**
 * this keyword: is an instance of current class 
 * 				used to differentiate local and non-static global variable when they same name
 * 				it should used only inside non-static method / constructor
 */
