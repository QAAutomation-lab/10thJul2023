package oopsrevision;
class Demo1{
	Demo1(){
		System.out.println("I am Demo1 class constructor");
	}
	static int getReverseNumber(int num) {
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	void checkEvenOddd(int num) {
		if(num%2==0) {
			System.out.println("Given number is even: "+num);
		}else {
			System.out.println("Given number is odd: "+num);
		}
	}
}	
public class Example1 extends Demo1 {
	Example1(){
		//super();// compiler will write super() on behalf of programmer
		System.out.println("I am Example1 class constructor");
	}
	void calling(int num) {
		System.out.println("I am calling-int "+num);
	}
	void calling(long num) {
		System.out.println("I am calling-long "+num);
	}
	@Override
	void checkEvenOddd(int num) {
		System.out.println("********Pls build some logic************");
		super.checkEvenOddd(25);
	}
	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.calling(123);
		e1.checkEvenOddd(20);
	}

}
