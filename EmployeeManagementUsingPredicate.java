import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagementUsingPredicate {

    public static void main(String args[])
    {
        ArrayList<EmployeeClass> listEmp = new ArrayList<EmployeeClass>();
        EmployeeClass emp1 = new EmployeeClass("Akash",
                "Software Engineer",1200000,"Bangalore");
        EmployeeClass emp2 = new EmployeeClass("Swati",
                "Senior Software Engineer",2200000,"Hyderabad");
        listEmp.add(emp1);
        listEmp.add(emp2);
        listEmp.add(new EmployeeClass("Prakash",
                "Senior Software Engineer",2200000,"Pune"));
        listEmp.add(new EmployeeClass("Priyanka",
                "Technical Lead",3500000,"Bangalore"));
        listEmp.add(new EmployeeClass("Akriti",
                "Software Engineer",800000,"Pune"));

        Predicate<EmployeeClass> predCity = emp -> emp.city.equals("Bangalore");
        for(EmployeeClass employee : listEmp)
        {
            //All employess from Bangalore
            if(predCity.test(employee))
            {
                System.out.println(employee);
            }
        }
        System.out.println("*********************************");
        //Employees from bangalore with salary more than 200000
        Predicate<EmployeeClass> predSal=
                emp -> emp.salary>2000000;

        for(EmployeeClass employee : listEmp)
        {
            //All employess from Bangalore
            if((predSal.and(predCity)).test(employee))
            {
                System.out.println(employee);
            }
        }
    }
}

class EmployeeClass
{
    String name;
    String designation;
    double salary;
    String city;

    EmployeeClass(String name, String designation,double salary,String city)
    {
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.city=city;
    }

    public String toString()
    {
        return "Name:"+this.name+" | Designation:"+this.designation
                +" | City: "+this.city+" | Salary: "+this.salary;
    }
}