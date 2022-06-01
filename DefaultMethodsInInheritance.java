public class DefaultMethodsInInheritance implements Left,Right {

    public void m1()
    {
        System.out.println("Class");
        Left.super.m1();
        Right.super.m1();
    }

    public static void main(String args[])
    {
        DefaultMethodsInInheritance obj = new DefaultMethodsInInheritance();
        obj.m1();

    }
}

interface Left
{
    default void m1()
    {
        System.out.println("Left");
    }
}
interface Right
{
    default void m1()
    {
        System.out.println("Right");
    }
}
