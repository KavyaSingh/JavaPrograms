import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, sort all the values present in it using Stream functions
public class SortListIntegersUsingStream {

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

        List<Integer> sortedListNum = listNum.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedListNumDescending = listNum.stream().sorted((num1,num2)->
                -num1.compareTo(num2)).collect(Collectors.toList());
        System.out.println(sortedListNum);
        System.out.println(sortedListNumDescending);
    }
}
