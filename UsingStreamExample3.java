//Given the list of integers, find the first element of the list using Stream functions

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UsingStreamExample3
{
    public static void main(String args[])
    {
        List<Integer> listNum = new ArrayList<Integer>();
        listNum.add(12);
        listNum.add(412);
        listNum.add(18888);
        listNum.add(43);
        listNum.add(123);
        listNum.add(456);
        listNum.add(543);
        listNum.add(2344);

        Function<List<Integer>,Integer> functionObj = listOfNum ->
                listOfNum.get(0);

        //Using reduce method
        System.out.println(listNum.stream().reduce((first,second)->first).orElse(null));

        System.out.println(listNum.stream().findFirst().orElse(null));

    }
}