import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee
{
    private String id;
    private String name;

    public Employee(String id, String name)
    {
        this.id = id;
        this.name=name;
    }
    public String getId()
    {
        return id;
    }
    public String getName(){
        return name;
    }
    public String toString()
    {
        return "Employee ID: "+id+"\n Name: "+name;
    }
}

    public class ListOfEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees=new ArrayList<>();
        System.out.println("Enter the number of employees: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the employee ID: ");
            String id=sc.next();
            System.out.println("Enter the employee name: ");
            String name=sc.next();
            employees.add(new Employee(id,name));
        }
        List<Employee>filteredEmployee=employees.stream().filter(emp->
                emp.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println("Employees whoose names start with 'A':");
        if(filteredEmployee.isEmpty()){
            System.out.println("No employees start with 'A'");
        }
        else{
            filteredEmployee.forEach(System.out::println);
        }

    }
}
