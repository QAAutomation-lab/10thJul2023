package methodExamples;

import oopsrevision.Example3;

public class Demo extends Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 e1=new Example3();
		//System.out.println(e1.age);
		//System.out.println(e1.empId);
		System.out.println(e1.getAge());
		e1.setAge(35);
		
		Demo d1=new Demo();
		System.out.println(d1.salary);
	}

}
