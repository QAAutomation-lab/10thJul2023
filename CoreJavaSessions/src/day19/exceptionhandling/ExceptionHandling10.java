package day19.exceptionhandling;
// Throwing Unchecked Exception
public class ExceptionHandling10 {   
    //function to check if person is eligible to vote or not   
    public static void validateAge(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");  
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){ 
    	System.out.println("Main starts from here");
    	//Without handling exception
    	validateAge(17);
        System.out.println("rest of the code...");    
  }    
}    

/**
throw: keyword is used to throw exception explicitly based on requirement
		it should be used inside method body only
		its allowed to throw only one exception at a time*/