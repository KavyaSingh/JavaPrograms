public class StaticMethodsInInterface {
    public static void main(String args[])
    {
        //Correct
        TestInterface.method1();

        //Incorrect
       /* StaticMethodsInInterface.method1();
        StaticMethodsInInterface ob2 = new StaticMethodsInInterface();
        ob2.method1();*/
    }
}

interface TestInterface
{
    static void method1()
    {
        System.out.println("TestInterface method1");
    }
}