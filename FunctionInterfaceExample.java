import java.util.function.Function;

public class FunctionInterfaceExample {

    public static void main(String args[])
    {
        String stringObject = "Computer Science branch";
        Function<String,Integer> functionOb = stringOb -> stringOb.length();

        System.out.println(functionOb.apply(stringObject));

    }
}
