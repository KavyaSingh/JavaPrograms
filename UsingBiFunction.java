import java.util.function.BiFunction;

public class UsingBiFunction
{
    public static void main(String args[])
    {
        BiFunction<Integer,Integer,String> biFunctionOb =
                (num1,num2) -> num1+num2+"";

        System.out.println(biFunctionOb.apply(10,29));

    }
}