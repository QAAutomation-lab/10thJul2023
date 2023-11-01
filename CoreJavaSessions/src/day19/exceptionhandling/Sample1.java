package day19.exceptionhandling;

class ShaileshException extends Exception{
	ShaileshException(String msg){
		super(msg);
	}
}
public class Sample1 {

	public static void main(String[] args)  {
		checkAge(19);
		checkBloodGroup('B');
		System.out.println("Program ends here..");

	}
	static void checkBloodGroup(char grp) {
		if(grp=='O') {
			System.out.println("You can donote blood");
		}else {
			try {
				throw new ShaileshException("I am shaileshexception class msg");
			} catch (ShaileshException e) {
				e.printStackTrace();
			}
		}
	}
	static void checkAge(int age) {
		if(age>=18) {
			System.out.println("You are eligible to VOTE");
		}else {
			throw new ArithmeticException("You are not eligible for voting");
		}
	}
}
