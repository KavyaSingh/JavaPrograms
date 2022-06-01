//Program removes null values and empty String  from ArrayList

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample2{

    public static void main(String args[])
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Kavya");
        names.add("Kriti");
        names.add("Akriti");
        names.add("");
        names.add("Priyanka");
        names.add("Prakash");
        names.add("Kritika");
        names.add(null);

        System.out.println(names);

        Predicate<String> predicateOb = name -> name==null||name.length()==0;
        names.removeIf(predicateOb);

        System.out.println(names);
    }
}
