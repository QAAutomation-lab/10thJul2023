package day10.constructors;
class Cons4 {
	int roll;
	double salary;
	Cons4(int r,double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Cons4 c1 = new Cons4(101,250045.45);
		c1.display();//101 250045.45
		Cons4 c2 = new Cons4(201,550045.45);		
		c2.display();//201 550045.45
		Cons4 c3 = new Cons4(0,1502.56);		
		c3.display();//0 1502.56
	}
}

/**
parameterized constructor: 
is used to initialize different values for non-static variable at the time of object creation

*/