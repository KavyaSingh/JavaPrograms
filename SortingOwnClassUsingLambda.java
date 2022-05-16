import java.util.*;

public class SortingOwnClassUsingLambda {


    public static void main(String args[])
    {
        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(10,"Akash"));
        empList.add(new Employee(1,"Akriti"));
        empList.add(new Employee(34,"Prakash"));
        empList.add(new Employee(24,"Smriti"));
        empList.add(new Employee(55,"Kavya"));
        empList.add(new Employee(28,"Kavita"));

        //Note - We cannot just use sort with empList below since custom objects jave no defined sorting order.
        //To do that, we will need the Employee class to implement the Comparable interface
        Collections.sort(empList,new MyComparatorForTreeMapForEmployee());
        System.out.println(empList);

        Collections.sort(empList,(Employee emp1,Employee emp2)->emp1.getRollNumber()>emp2.getRollNumber()?-1:
                emp1.getRollNumber()<emp2.getRollNumber()?1:0);
        System.out.println(empList);


    }

}

class Employee
{
    private int rollNumber;
    private String name;

    Employee(int rollNumber,String name)
    {
        this.rollNumber=rollNumber;
        this.name=name;
    }

    public String toString()
    {
        return this.rollNumber+"->"+this.name;
    }

    public int getRollNumber()
    {
        return this.rollNumber;
    }

}

//Comparator
class MyComparatorForTreeMapForEmployee implements Comparator{

    //Method sorts Employee object in ascending roll number order
    public int compare(Object obj1,Object obj2)
    {
        return ((Employee) obj1).getRollNumber()< ((Employee)obj2).getRollNumber()?-1:
                ((Employee)obj1).getRollNumber()> ((Employee)obj2).getRollNumber()?1:0;
    }
}