package day15.encapsulations;
class Student3 {
	// private data member
		private int pinCode = 411015;
		// setter method will allow you to modify private data member value without impacting original data
		public void setPinCode(int pin) {
			 pinCode=pin;
		}
}
public class WriteOnly {

	public static void main(String[] args) {

		// creating instance of the encapsulated class
		Student3 s = new Student3();
		// getting value of the name member
		s.setPinCode(12345);
		//we don;t have permission to read the data from Student3 class
		//System.out.println(s.pinCode);
		System.out.println("Bye");
	}
}
