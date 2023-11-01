package day15.encapsulations;
public class Encap4 {
	public static void main(String[] args) {
		// creating instance of Account class
		Account acc = new Account();
		// getting values through getter methods
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getAmount());
		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setAmount(500000f);
		// getting values through getter methods
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getAmount());
		System.out.println("**************************");
		// creating instance of Account class
		Account a2 = new Account();
		System.out.println("Account  number using new object: "+a2.getAcc_no());
		System.out.println("Amount using new Object: "+a2.getAmount());
	}
}