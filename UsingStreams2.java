import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreams2 {

    public static void main(String []args)
    {
        ArrayList<Integer> listNum = new ArrayList<Integer>();
        listNum.add(34);
        listNum.add(12);
        listNum.add(45);
        listNum.add(123);
        listNum.add(66);
        listNum.add(78);

        //Without Streams
        ArrayList<Integer> listSquare = new ArrayList<Integer>();

        for(Integer i:listNum)
        {
            listSquare.add(i*i);
        }

        //With Streams
        List<Integer> listSquareStream = new ArrayList<Integer>();
        listSquareStream = listNum.stream().map(I->I*I).collect(Collectors.toList());

        System.out.println("listEven "+listSquare);
        System.out.println("listEvenStreams "+listSquareStream);
    }
}
