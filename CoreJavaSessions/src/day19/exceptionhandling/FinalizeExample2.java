package day19.exceptionhandling;

public class FinalizeExample2 {
	
	public void finalize() throws Throwable {
		try {
			System.out.println("inside finalize method");
		}catch(Throwable e) {
			throw e;
		}finally{
			System.out.println("Calling finalize method of the Object class");
			super.finalize();
		}
	}

	public static void main(String[] args) throws Throwable {
		// finalize - just before destroying any object, garbage collector always calls finalize() to perform clean-up
		// activities on that object
		 
		FinalizeExample2 f1= new FinalizeExample2();
		f1.finalize();		
		System.out.println("Program Ends");		
	}
	
}
