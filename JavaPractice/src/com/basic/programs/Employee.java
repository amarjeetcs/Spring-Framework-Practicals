package com.basic.programs;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String company;
    private String location;

    public Employee(String name, String company, String location) {
        this.name = name;
        this.company = company;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        
        employees.add(new Employee("John", "TCS", "Bangalore"));
        employees.add(new Employee("Jane", "TCS", "Hyderabad"));
        employees.add(new Employee("Bob", "TCS", "Bangalore"));
        employees.add(new Employee("Alice", "TCS", "Hyderabad"));

       
        System.out.println("List of TCS employees:");
        for (Employee employee : employees) {
            if (employee.getCompany().equals("TCS")
                    && (employee.getLocation().equals("Bangalore") || employee.getLocation().equals("Hyderabad"))) {
                System.out.println(employee.getName() + " - " + employee.getLocation());
            }
        }
    }
}
