@FunctionalInterface
public interface FunctionalInterfaceSample {
    public void abstractMethod();
    default void m2(){    }
    public static void m3() {    }

}


interface FunctionalInterfaceChild extends FunctionalInterfaceSample {
    public void abstractMethod1();
    default void m2(){}
    public static void m3(){}

}