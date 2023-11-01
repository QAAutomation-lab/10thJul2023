package day6.statements;

public class SwitchCase1 {
	public static void main(String args[]) {
		int value = 50;
		switch (value) {
		case 30:
			System.out.println("Congratulations here is the case 30 executed");
			break;
		case 10:
			System.out.println("Congratulations here is the case 10 executed");
			break;
		case 50:
			System.out.println("Congratulations here is the case 50 executed");
			break;
		default:
			System.out.println("Sorry none of your cases matched");
			break;
		}
	}
}
/**
 * break: means terminate/break the current flow
 * default: is not a mandatory case
 */ 
