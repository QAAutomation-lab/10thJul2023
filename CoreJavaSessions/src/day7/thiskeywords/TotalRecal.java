package day7.thiskeywords;

public class TotalRecal {
	TotalRecal(){
		System.out.println("Zero-param cons");
	}
	
	TotalRecal(int age){
		System.out.println("int-param cons");
		this.age=age;
		System.out.println("Local age: "+age);
		System.out.println("Global age: "+this.age);
	}

	static double salary;
	int age=25;
	public static void main(String[] args) {
		int num1=25,num2=20,res;
		res=num1+num2;
		System.out.println("Number1 is :"+num1);
		System.out.println("Number2 is :"+num2);
		System.out.println("Addition result is :"+res);
		
		System.out.println("Static global varaible salary: "+salary);
		TotalRecal.salary=45000.56;
		System.out.println("updated Static global varaible salary: "+TotalRecal.salary);
		
		TotalRecal t1=new TotalRecal();
		System.out.println("Non-static global variable age : "+t1.age);
		t1.age=45;
		System.out.println("updated, Non-static global variable age : "+t1.age);
		
		TotalRecal t2=new TotalRecal();
		System.out.println("Non-static global variable age using t2 : "+t2.age);
		
		System.out.println("Addition result : "+getAddition(10, 20));
		int sum=getAddition(45, 55)*10;
		System.out.println("Sum: "+sum);
		
		System.out.println("Addition result : "+getAddition());
		int sum1=getAddition()*10;
		System.out.println("Sum1: "+sum1);
		
		System.out.println("Is passed number even? "+t2.isEven(25));
		System.out.println("Is passed number even? "+t2.isEven());
	}
	
	boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean isEven() {
		int num=45;
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	static int getAddition()
	{	int num1=45,num2=75;
		int res=num1+num2;
		return res;
	}
	static int getAddition(int num1,int num2)
	{
		int res=num1+num2;
		return res;
	}

}
