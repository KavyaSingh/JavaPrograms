import java.util.function.Consumer;

public class ConsumerInterfaceExample {

    public static  void main (String args[])
    {
        Consumer<String> cons = stringOb -> System.out.println(stringOb);
        cons.accept("Testing consumer");
    }
}
