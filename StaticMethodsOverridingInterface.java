public class StaticMethodsOverridingInterface implements TestInterfaceForOveriding {

    public static void main(String args[])
    {
    }

    //Making static method as non static in implementation class gives error normally.
    //But this will work since it is not overriding concept
    void method1()
    {
        System.out.println("TestInterface method1");
    }

    //Reducing method scope in implementation class gives error normally.
    //But this will work since it is not overriding concept
    /*private void method1()
    {
        System.out.println("TestInterface method1");
    }*/
}


interface TestInterfaceForOveriding
{
    static void method1()
    {
        System.out.println("TestInterface method1");
    }
}