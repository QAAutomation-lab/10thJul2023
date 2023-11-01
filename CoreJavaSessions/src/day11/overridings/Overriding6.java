package day11.overridings;

class Parent2 {
    // private methods are not overridden, because private member doesn't participate in inheritance
    private void m1()
    {
        System.out.println("From parent m1()");
    }  
    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}
  
class Child2 extends Parent2 {
    // new m1() method no overriding here as its a private method, unique to Child class
    public void m1()
    {
        System.out.println("From child m1()");
    }  
    // overriding method with more accessibility
    @Override
    protected void m2()
    {
        System.out.println("From child m2()");
    }
}
  
// Driver class
class Overriding6 {
    public static void main(String[] args)
    {
        Parent2 obj1 = new Parent2();
        obj1.m2();
        //obj1.m1();//compile time error as private members can;t be access from outside the class
        Parent2 obj2 = new Child2();
        obj2.m2();
        Child2 obj3 = new Child2();
        obj3.m2();
        obj3.m1();
    }
}

/**
In java we can increase the visibility of members but we can not decrease it
private -- can't override because they won;t get inherited to child class and we can't change its access modifier while override
default --> default/protected/public
protected -->protected/public
public ----> public

private member of parent class can't be overridden
*/