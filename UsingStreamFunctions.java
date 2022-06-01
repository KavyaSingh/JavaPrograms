import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UsingStreamFunctions{

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

            //Given a list of integers, find the total number of elements present in the list using Stream functions
            System.out.println(listNum.stream().count());

            //Given a list of integers, find the maximum value element present in it using Stream functions
            System.out.println(listNum.stream().max((i,j)->i.compareTo(j)).get());
            System.out.println(listNum.stream().max((i,j)->-i.compareTo(j)).get());
        }
}
