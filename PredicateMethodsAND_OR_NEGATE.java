import java.util.function.Predicate;

public class PredicateMethodsAND_OR_NEGATE {

    public static void main(String args[])
    {
        Predicate<Integer> predicate1= i -> i>10;
        Predicate<Integer> predicate2= i -> (i%2)==0;

        System.out.println((predicate1.and(predicate2).test(45)));
        System.out.println((predicate1.or(predicate2).test(5)));
        System.out.println((predicate1.or(predicate2).test(44)));
        System.out.println((predicate1.and(predicate2).test(44)));
        System.out.println(predicate1.negate().test(32));
    }
}
