//Program checks whether names of a list of students start with K(Using predicate)

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample1 {

    public static void main(String args[])
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Kavya");
        names.add("Kriti");
        names.add("Akriti");
        names.add("Priyanka");
        names.add("Prakash");
        names.add("Kritika");

        Predicate<String> predicateOb = name -> name.charAt(0)=='K';
        for(String name  : names)
            System.out.println(name+" starts with K:"+predicateOb.test(name));
    }
}
