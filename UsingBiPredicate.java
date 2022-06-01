import java.util.function.BiPredicate;

public class UsingBiPredicate {

    public static void main(String arg[])
    {
        BiPredicate<Integer,Integer> predicateOb = (num1, num2) ->
            (num1+num2)%2==0;

        System.out.println(predicateOb.test(10,23));
        System.out.println(predicateOb.test(10,20));
    }
}
