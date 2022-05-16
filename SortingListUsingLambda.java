import java.util.ArrayList;
import java.util.Collections;

public class SortingListUsingLambda {

    public static void main(String args[])
    {
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        listNumbers.add(10);
        listNumbers.add(5);
        listNumbers.add(45);
        listNumbers.add(25);
        listNumbers.add(453);
        listNumbers.add(41);
        listNumbers.add(100);
        System.out.println(listNumbers);

        //Using default sorting ascending
        //Collections.sort(listNumbers);
        //System.out.println(listNumbers);

        //Collections.sort(listNumbers,new MyComparator());
        //System.out.println(listNumbers);

        Collections.sort(listNumbers,( obj1, obj2)->
            (obj1>obj2)?-1:(obj1<obj2)?1:0
        );
        System.out.println(listNumbers);

    }
}

/*class MyComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
       if((Integer)o1>(Integer)o2)
           return -1;
       else
           if ((Integer)o1<(Integer)o2)
               return 1;
       else
           return 0;
    }
}*/
