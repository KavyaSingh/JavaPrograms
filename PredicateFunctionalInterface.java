import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String args[])
    {
        Predicate<Integer> P = I->(I>10);
        System.out.println(P.test(100));
    }
}

