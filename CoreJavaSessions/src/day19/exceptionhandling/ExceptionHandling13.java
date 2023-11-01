package day19.exceptionhandling;
public class ExceptionHandling13 {
	    public static void main(String[] args) throws InterruptedException, UserDefinedException   
	    {
	    	System.out.println("program starts");
	    	setSleep(5000);
	    	checkNumber(1);
	        System.out.println("Hello Geeks");
	    }
	    static void setSleep(long time) throws InterruptedException {
	    	Thread.sleep(time);
	    }
	    
	    static void checkNumber(int num) throws UserDefinedException {
	    	if(num<0){
	    		throw new UserDefinedException("Number less dn zero");
	    	}else {
	    		System.out.println("Number is :"+num);
	    	}
	    }
}
/**
try-catch--> to handle the exception
throw------> to throw the exception from a method body, this needs to handled by using throws or try-catch
throws------> use to declare exception thrown by a method while calling or use to declare a exception on method level
*/