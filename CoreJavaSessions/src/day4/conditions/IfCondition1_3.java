package day4.conditions;

public class IfCondition1_3 {
	public static void main(String[] args) {
		int year = 2000;
		if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
		}
	}
	
}

/**



*/