package day19.exceptionhandling;
//Throwing UserDefinedException, class represents user-defined exception  
class ShaileshException extends Exception {
	public ShaileshException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}
//Class that uses above MyException  
public class ExceptionHandling12 {
	public static void validateAge(int age) throws ShaileshException  {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ShaileshException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	public static void calling() {
		try {
			validateAge(25);
		} catch (ShaileshException e) {
			e.printStackTrace();
		}
		System.out.println("I am calling");
	}
	public static void main(String args[]) throws ShaileshException {
	
		System.out.println("Hello");
		calling();
		validateAge(15);
		System.out.println("Rest of the code..");
	}
}

/**
throw ---> is used to throw explicit exception from a method body, it can be checked or unchecked exception
	  ---> if its a checked exception dn you have handle it by using try-catch block or you can declare that exception
	  	   in method label using throws keyword in this case where ever this method gets called in that method you need
	  	   to handle to exception in order to continue the program

*/