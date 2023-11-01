package day7.staticMethods;

public class TestFunction {
	/*
	 * access modifier: public
	 * non-access modifier: static
	 * return type: void
	 * methodname: main
	 * argument/parameter: String[]
	 * return value: no
	 */
	public static void main(String[] args) {
		
	}
	
	/*
	 * access modifier: default
	 * non-access modifier: non-static
	 * return type: double
	 * methodname: calling
	 * argument/parameter: int 
	 * return value: 15.36
	 */
	double calling(int num) {
		System.out.println("I am calling you"+num);
		return 15.36;
	}
}
