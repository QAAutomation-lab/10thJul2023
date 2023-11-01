package day6.statements;

public class IfElseLadder {
	public static void main(String args[]) {
		int value = 20;
		if(value==30) {
			System.out.println("Value is 30");
		}else if(value==10) {
			System.out.println("Value is 10");
		}else if(value==50) {
			System.out.println("Value is 50");
		}else {
			System.out.println("No matching");
		}
	}
}
/**
 * break: means terminate/break the current flow
 * default: is not a mandatory case
 */ 
