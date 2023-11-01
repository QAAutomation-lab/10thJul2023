package day11.inheritances;
//parent class
class fruits{
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class orange extends fruits {
	int fruitAge;
	orange() {
		// super(); //java compiler will write default super()
		System.out.println("orange class Cons..");
		fruitAge = 5;
	}
	@Override
	public void taste() {
		System.out.println("orange are sweet");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: "+fruitAge);//5
		taste();//calling orange class taste method	
		System.out.println("****************************");
//		fruits f1=new fruits();
//		f1.taste();
//		System.out.println("Age from fruits class: "+f1.fruitAge);
		System.out.println("##########################");
		super.taste();
		System.out.println("Age from fruits class: "+super.fruitAge);
	}
}
public class Inheritance7 {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		orange o1=new orange();
		o1.shape();
		System.out.println("*******************************************");
	}
}

/**
 * overriding: when we declare a method in sub class which is already present in super class 
 *             dn that method will be known as overrided method
 *           * its possible when only classes are involved in inheritance
 *           * it is possible only with non-static method
 *           * while overriding method signature should be same and body can be changed
 *           * not possible scenarios:
 *           	1. static method overriding not possible
 *              2. variable overriding not possible
 *              3. constructor overriding not possible
 *              4. final method overriding not possible
 *              6. private method overriding not possible
 * super keyword: instance of immediate parent class
 * 			* it used to access non-static members of the parent class from child class
 * 			* super keyword should be used only inside non-static method/constructor
 * 			* mainly used when parent class and child class non-static members name are same
 * 
 * 
 * what is this keyword?
 * why to use this keyword?
 * where can we use this keyword?
 * 
 * what is super keyword?
 * why to use super keyword?
 * where can we use super keyword?
 * 
 * what is super()?
 * why to use super()?
 * where can we use super()?
 * 
 * what is this()?
 * why to use this()?
 * where can we use this()?
 * 
 * this vs super
 * this() vs super()
 */
