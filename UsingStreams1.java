import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreams1 {

    public static void main(String args[])
    {
        ArrayList<Integer> listNum = new ArrayList<Integer>();
        listNum.add(34);
        listNum.add(12);
        listNum.add(45);
        listNum.add(123);
        listNum.add(66);
        listNum.add(78);

        //Without Streams
        ArrayList<Integer> listEven = new ArrayList<Integer>();

        for(Integer i:listNum)
        {
            if (i%2==0)
                listEven.add(i);
        }

        //With Streams
        List<Integer> listEvenStreams = new ArrayList<Integer>();
        listEvenStreams = listNum.stream().filter(I->I%2==0).collect(Collectors.toList());

        System.out.println("listEven "+listEven);
        System.out.println("listEvenStreams "+listEvenStreams);
    }
}
