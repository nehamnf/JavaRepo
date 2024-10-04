package javaconcepts.other.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
    @Override
    public String toString() { return name; }
}

class Manager extends Employee {
    Manager(String name) { super(name); }
}

class Developer extends Employee {
    Developer(String name) { super(name); }
}


public class GenericsExtendsDemo {
    public static void main(String[] args) {
        List<Manager> managers = new ArrayList<>();
        managers.add(new Manager("Alice"));
        managers.add(new Manager("Bob"));

        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("Charlie"));
        developers.add(new Developer("David"));

        // This works because Manager and Developer are subclasses of Employee
        printEmployeeDetails(managers);
        printEmployeeDetails(developers);

        List<Employee> employees = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addManagers(employees); // Valid, because Employee is a superclass of Manager
        addManagers(objects);   // Valid, because Object is a superclass of Manager

        System.out.println("Employees: " + employees);
        System.out.println("Objects: " + objects);

    }

    // Method that can accept a list of Employee or its subclasses
    public static void printEmployeeDetails(List<? extends Employee> employees) {
//        employees.add("neha"); We can not do this as we don't know the exact type to insert whether its manager or developer only can be used to read the data
        Object[] ob = employees.toArray();
        System.out.println("===="+Arrays.toString(ob));
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Method that can add Manager objects to a list of Employee or its superclasses
    public static void addManagers(List<? super Manager> employees) {
        employees.add(new Manager("Eve"));
        employees.add(new Manager("Frank"));
    }
}
