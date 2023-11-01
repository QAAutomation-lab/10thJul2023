package day18.predefinedclasses.objectclass;
class TestSample{
	void callMe() {
		System.out.println("Hello");
	}
}
public class Example4 extends TestSample{
	static int last_roll = 100;
	int roll_no;
	Example4()
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
	public int hashCode() {
		return 505;
	}
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }
	public static void main(String args[]) {
		Example4 s = new Example4();
		System.out.println(s.hashCode());
		System.out.println(s);
		 TestSample t1=new TestSample();
		 System.out.println(t1);
		 System.out.println(t1.hashCode());
	}
}
