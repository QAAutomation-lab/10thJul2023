package day7.staticMethods;

public class Assignment {
	
	/**
	 * Global variables 
	 * static and non-static
	 */
	/**
	 * Method for both static and non-static
	 * with and without parameter
	 * with and without return type
	 */
	/*
	 * Area of circle
	 */
	static double areaOfCricle(double r) {
		double pi=3.14;
		double area=pi*r*r;
		System.out.println("radius is "+r);
		return area;
	}
	/*
	 * Area of rectangle
	 */
	static float areaOfRectangle(float l,float w) {
		System.out.println("L: "+l);
		System.out.println("w: "+w);
		float area=l*w;
		return area;
	}
	/*
	 * Area of triangle
	 */
	static float areaOfTriangle(int b, int h) {
		System.out.println("b: "+b);
		System.out.println("h: "+h);
		float area=(0.5f)*b*h;
		return area;
	}
	public static void main(String[] args) {
		
		System.out.println("Area of Triangle: "+areaOfTriangle(5, 10));
		
		System.out.println("Area of rectangle: "+areaOfRectangle(5.5f, 5.0f));		
		//areaOfCricle(5.5); //or		
		//System.out.println("Area of circle: "+areaOfCricle(5.5)); //or		
		double res=areaOfCricle(5.5);
		System.out.println("Result: "+res);
	}

}
