/*
public class AnonymousInnerClassUsingthis {

    public static void main(String args[])
    {
        int x=500;
        InterfaceSample1 interfaceSample1Obj1 = new InterfaceSample1() {
            @Override
            public void method1() {
                int x=1000;

                System.out.println(this.x);
            }
        };
        interfaceSample1Obj1.method1();

        InterfaceSample1 interfaceSample1Obj2 = ()->
        {
            x=1000;
            System.out.println(this.x);
        };
        interfaceSample1Obj2.method1();
    }
}

interface InterfaceSample1
{
    public void method1();
}
*/
