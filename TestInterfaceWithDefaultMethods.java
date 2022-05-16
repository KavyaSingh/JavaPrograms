interface InterfaceWithDefaultMethods {
    default void methodDefault()
    {
        System.out.println("Interface implementation");
    }
}

public class TestInterfaceWithDefaultMethods implements  InterfaceWithDefaultMethods
{
    public void methodDefault()
    {
        System.out.println("Class implementation");
    }

    public static  void main(String args[])
    {
        TestInterfaceWithDefaultMethods obj = new TestInterfaceWithDefaultMethods();
        obj.methodDefault();
    }
}