package day19.exceptionhandling;
public class ExceptionHandling11 {
	// function to check if person is eligible to vote or not
	public static void validateAge(int age) {
		if (age <=18) {
			// throw Arithmetic exception if not eligible to vote
			//System.out.println("Person is not eligible to vote");
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	// main method
	public static void main(String args[]) {
		System.out.println("Prgram starts from here ");
		// calling the function
		//validateAge(17);
		
		 //handling exception, calling the function  
    	try {
    		validateAge(17);
    	}catch(ArithmeticException e) {
    		System.out.println(e);
    	}
		System.out.println("rest of the code...");
	}
}