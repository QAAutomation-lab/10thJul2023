package propertyFile;
class Author{
	String authorName;
	int age;
	String place;
	Author(String authorName,int age,String place){
		this.authorName=authorName;
		this.age=age;
		this.place=place;
	}
}
public class Book {

	String name;
	int price;
	Author obj;
	Book(String name, int price, Author ref){
		this.name=name;
		this.price=price;
		this.obj=ref;
	}
	public static void main(String[] args) {
		Author a1=new Author("R.S.Agarwal",55,"Delhi");
		Book b1=new Book("Java Basics",450,a1);
		System.out.println("==============Book class members====================");
		System.out.println(b1.name);
		System.out.println(b1.price);
		System.out.println("++++++++++++++Author class members+++++++++++++++++++++");
		System.out.println(b1.obj.authorName);
		System.out.println(b1.obj.age);
		System.out.println(b1.obj.place);
	}

}
