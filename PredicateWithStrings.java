import java.util.function.Predicate;

public class PredicateWithStrings {

    public static void main(String args[])
    {
        Predicate<String> P = s -> s.length()>5;
        System.out.println(P.test("DURGASOFT"));
        System.out.println(P.test("Manh"));
    }
}

