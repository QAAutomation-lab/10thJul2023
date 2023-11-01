package day18.predefinedclasses;

public class WrapperExample1 {

	public static void main(String[] args) {
		
		int age=25;
		
		Integer obj=age;//implicit boxing / autoboxing
				//or
		Integer obj1=25;//implicit boxing / autoboxing
				//or		
		Integer obj3=new Integer(age);//explicit boxing
				//or
		Integer obj4=new Integer(25);//explicit boxing
		
		System.out.println("age: "+age);
		System.out.println("Obj: "+obj);		
		System.out.println("age==obj : "+(age==obj));
		
		int x=obj.intValue();//unboxing operation
		System.out.println("x: "+x);
		
		Boolean bObj=true;//implicit boxing
		boolean b=bObj.booleanValue();//unboxing
		System.out.println("bObj==b : "+(bObj==b));
		
		
		char c1='a';
		Character cObj=c1;//implicit boxing
		char c2=cObj.charValue();//unboxing

	}

}
/**
 * Wrapper classes belongs to java.lang package
 * user to perform boxing/unboxing operation
 * here toString() is overrided and it give the value stored inside the object
 * 
 */
