package assignment2;

public class Assignment4
{
    // Description:
    //  Calculate social security tax
    // Return:
    //  double socialSecurityTax
    //
    public static double socialSecurityTax(Employee employee)
    {
        double socialSecurityTax = 0;
        if (employee.salary <= 8900)
        {
            socialSecurityTax = 0.062 * employee.salary;
        }
        else
        {
            socialSecurityTax = 0.062 * 106800;
        }

        return socialSecurityTax;
    }

    // Description:
    //  Calculate insurance coverage
    // Return:
    //  double insuranceCoverage
    //
    public static double insuranceCoverage(Employee employee)
    {
        double insuranceCoverage = 0;
        if (employee.age < 35)
        {
            insuranceCoverage = 0.03 * employee.salary;
        }
        else if (35 <= employee.age && employee.age <= 50)
        {
            insuranceCoverage = 0.04 * employee.salary;
        }
        else if (50 < employee.age && employee.age < 60)
        {
            insuranceCoverage = 0.05 * employee.salary;
        }
        else
        {
            insuranceCoverage = 0.06 * employee.salary;
        }

        return insuranceCoverage;
    }

    // Description:
    //  sort salary of employees and print their name
    // Return:
    //  void
    //
    public static void sortSalary(Employee e1, Employee e2, Employee e3)
    {
        Employee employeeList[] = new Employee[]{e1, e2, e3};
        for(int i = 0; i < employeeList.length; i++)
        {
            for (int j = i + 1; j < employeeList.length; j++)
            {
                if (employeeList[i].salary > employeeList[j].salary)
                {
                    swap(employeeList[i], employeeList[j]);
                }
            }

            System.out.print(employeeList[i].name + " ");
        }

        System.out.print("\n");
    }

    // Description:
    //  Swap employees
    // Return:
    //  void
    //
    public static void swap(Employee x, Employee y)
    {
        Employee temp = new Employee();
        temp.name = x.name;
        temp.age = x.age;
        temp.salary = x.salary;

        x.name = y.name;
        x.age = y.age;
        x.salary = y.salary;

        y.name = temp.name;
        y.age = temp.age;
        y.salary = temp.salary;
    }

    public static void main(String[] args)
    {
        Employee a = new Employee("Jenny", 20, 9000);
        Employee b = new Employee("John", 36, 2500);

        System.out.println("Social security tax of " + a.name + " is " + socialSecurityTax(a));
        System.out.println("insurance coverage " + b.name + " is " + insuranceCoverage(b));

        System.out.println("Before: a=" + a.name);
        System.out.println("Before: b=" + b.name);
        swap(a, b);
        System.out.println("After: a=" + a.name);
        System.out.println("After: b=" + b.name);

        Employee c = new Employee("Alice", 25, 1500);
        sortSalary(a,b,c);
    }
}
