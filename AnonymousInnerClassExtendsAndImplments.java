public class AnonymousInnerClassExtendsAndImplments {

    public static void main(String args[])
    {
        InterfaceSample interfaceObj = new InterfaceSample() {
            @Override
            public void interfaceMethod(String sampleString) {
                System.out.println("interfaceMethod: "+sampleString);
            }
        };

        AbstractClassSample abstractObje = new AbstractClassSample() {
            @Override
            void abstractClassMethod(String sampleString) {
                System.out.println("abstractClassMethod: "+sampleString);
            }
        };

        ConcreteClass concreteObj = new ConcreteClass();
        concreteObj.concreteClassMethod("Test");
        interfaceObj.interfaceMethod("TestInterface");
        abstractObje.abstractClassMethod("Abstract");

    }

}

class ConcreteClass
{
     public void concreteClassMethod(String sampleString)
     {
         System.out.println("ConcreteClassMethod: "+sampleString);
     }
}

abstract class AbstractClassSample
{
    abstract void abstractClassMethod(String sampleString);
}

interface InterfaceSample
{
     void interfaceMethod(String sampleString);
}