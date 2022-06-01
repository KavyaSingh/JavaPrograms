import java.util.function.Predicate;

public class PredicateisEqual {

    public static void main(String args[])
    {
        Predicate<String> predicateOb = Predicate.isEqual("Akash");
        System.out.println(predicateOb.test("Akash")); //returns true
        System.out.println(predicateOb.test("Durga")); //returns false

    }
}
