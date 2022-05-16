import java.util.*;

public class TreeMapWithLambda

{
    public static void main(String args[])
    {
        TreeMap<Integer,String> treeMapObject = new TreeMap<Integer,String>();
        treeMapObject.put(14,"Suman");
        treeMapObject.put(11,"Ravi");
        treeMapObject.put(44,"Akash");
        treeMapObject.put(1,"Kriti");
        treeMapObject.put(345,"Prakas");
        treeMapObject.put(12,"Vikas");
        treeMapObject.put(1455,"Kavya");

        System.out.println(treeMapObject);

        TreeMap<Integer,String> treeMapUsingComparator = new TreeMap<Integer,String>(new MyComparatorForTreeMap());
        treeMapUsingComparator.put(14,"Suman");
        treeMapUsingComparator.put(11,"Ravi");
        treeMapUsingComparator.put(44,"Akash");
        treeMapUsingComparator.put(1,"Kriti");
        treeMapUsingComparator.put(345,"Prakas");
        treeMapUsingComparator.put(12,"Vikas");
        treeMapUsingComparator.put(1455,"Kavya");

        System.out.println(treeMapUsingComparator);

        TreeMap<Integer,String> treeMapUsingLamda = new TreeMap<Integer,String>((obj1,obj2)->obj1>obj2?-1:obj1<obj2?1:0);
        treeMapUsingLamda.put(14,"Suman");
        treeMapUsingLamda.put(11,"Ravi");
        treeMapUsingLamda.put(44,"Akash");
        treeMapUsingLamda.put(1,"Kriti");
        treeMapUsingLamda.put(345,"Prakas");
        treeMapUsingLamda.put(12,"Vikas");
        treeMapUsingLamda.put(1455,"Kavya");

        System.out.println(treeMapUsingLamda);

    }


}

class MyComparatorForTreeMap implements Comparator{

    public int compare(Object obj1,Object obj2)
    {
        return (Integer) obj1> (Integer)obj2?-1: (Integer)obj1< (Integer)obj2?1:0;
    }
}