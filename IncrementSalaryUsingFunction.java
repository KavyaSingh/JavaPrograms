import java.util.ArrayList;
import java.util.function.Function;

public class IncrementSalaryUsingFunction {

    public static void main(String args[])
    {
        ArrayList<EmployeeInFirm> listEmp = new ArrayList<EmployeeInFirm>();
        listEmp.add(new EmployeeInFirm("A",908888.00));
        listEmp.add(new EmployeeInFirm("B",1000000.000));
        listEmp.add(new EmployeeInFirm("C",750000.00));
        listEmp.add(new EmployeeInFirm("D",913333.00));


        for(EmployeeInFirm e: listEmp)
        {
            System.out.println("e.name-> "+e.salary);
        }

        Function<ArrayList<EmployeeInFirm>,String> f =
            listOfEmployees ->
            {
                for(EmployeeInFirm e: listOfEmployees)
                {
                    e.salary=e.salary+(.3*e.salary);
                }
                return null;
            };

        f.apply(listEmp);

        for(EmployeeInFirm e: listEmp)
        {
            System.out.println("e.name-> "+e.salary);
        }

    }


}
class EmployeeInFirm
{
    String name;
    Double salary;

    public EmployeeInFirm(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
}