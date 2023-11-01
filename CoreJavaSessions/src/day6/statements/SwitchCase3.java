package day6.statements;

public class SwitchCase3 {

	public static void main(String args[]) {
		char ch = 'o';
		switch (ch) {
		case 'e':
			System.out.println("Value matched - e, a vowel");
			break;
		case 'a':
			System.out.println("Value matched - a, a vowel");
			break;
		case 'u':
			System.out.println("Value matched - u, a vowel");
			break;
		case 'o':
			System.out.println("Value matched - o, a vowel");
			break;
		case 'i':
			System.out.println("Value matched - i, a vowel");
			break;
		default:
			System.out.println("Given char is not a vowel");
			break;
		}
		System.out.println("Program ends here...");
	}
}
