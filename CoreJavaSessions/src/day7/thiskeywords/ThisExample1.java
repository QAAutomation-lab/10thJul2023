package day7.thiskeywords;
public class ThisExample1 {
	int x=25,y=55;
	void calling(int x) {//int x=10;
		System.out.println("local variable x: "+x);//10
		System.out.println("non-static global y: "+y);//55
		
//		ThisExample1 e1=new ThisExample1();
//		System.out.println("non-static global x: "+e1.x);
				//or
		System.out.println("non-static global x: "+this.x);//25
		//GNSV = LV;
		this.x=x;
	}
	public static void main(String[] args) {
		
		ThisExample1 t1=new ThisExample1();
		t1.calling(10);
		System.out.println("x: "+t1.x);//10
		System.out.println("y: "+t1.y);//55
	}
}
/*
 * this keyword:
 * 		is known as current class instance/object
 * 		used to access only non-static member
 * 		can be used only inside non-static method/constructor
 * 		mainly used to differentiate local variable of non-static method/constructor when they have
 * 		same name as non-static global variable
 * 
 */
