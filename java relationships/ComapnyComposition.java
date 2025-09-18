import java.util.*;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();
    Department(String name) {
        this.name = name;
    }
    void addEmployee(Employee e) {
        employees.add(e);
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();
    Company(String name) {
        this.name = name;
    }
    void addDepartment(Department d) {
        departments.add(d);
    }
    void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            System.out.println("Dept: " + d.name);
            for (Employee e : d.employees) {
                System.out.println("Employee: " + e.name);
            }
        }
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company c = new Company("TCS");
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");
        d1.addEmployee(new Employee("Advita"));
        d2.addEmployee(new Employee("Riya"));
        c.addDepartment(d1);
        c.addDepartment(d2);
        c.showCompany();
    }
}

