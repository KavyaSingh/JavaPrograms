import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithLambda {


    public static void main(String args[])
    {
        //Default sorting order is ascending
        TreeSet<Integer> listNumbers = new TreeSet<Integer>();
        listNumbers.add(10);
        listNumbers.add(5);
        listNumbers.add(45);
        listNumbers.add(25);
        listNumbers.add(453);
        listNumbers.add(41);
        listNumbers.add(100);
        System.out.println(listNumbers);

        //Using Comparator will print it in descending order
        TreeSet<Integer> listNumbersWithComparator = new TreeSet<Integer>(new MyComparator());
        listNumbersWithComparator.add(10);
        listNumbersWithComparator.add(5);
        listNumbersWithComparator.add(45);
        listNumbersWithComparator.add(25);
        listNumbersWithComparator.add(453);
        listNumbersWithComparator.add(41);
        listNumbersWithComparator.add(100);
        System.out.println(listNumbersWithComparator);

        //Using Lambda
        TreeSet<Integer> listNumbersWithLambda = new TreeSet<Integer>((obj1,obj2)->obj1>obj2?-1:obj1<obj2?1:0);
        listNumbersWithLambda.add(10);
        listNumbersWithLambda.add(5);
        listNumbersWithLambda.add(45);
        listNumbersWithLambda.add(25);
        listNumbersWithLambda.add(453);
        listNumbersWithLambda.add(41);
        listNumbersWithLambda.add(100);
        System.out.println(listNumbersWithLambda);

    }
}
class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if ((Integer) o1 > (Integer) o2)
            return -1;
        else if ((Integer) o1 < (Integer) o2)
            return 1;
        else
            return 0;
    }
}
