package com.lakshay.midterm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private String email;
    private double salary;

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void applyOps() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Anuj", "anuj@Epam.com", 27500.00));
        employees.add(new Employee("Lakshay", "lakshay@epam.com", 27500.00));
        employees.add(new Employee("sid", "sid@epam.com", 27500.00));
        employees.add(new Employee("Ajay", "Ajay@epam.com", 27500.00));
        employees.add(new Employee("Amar", null, 27500.00));

        List<Employee> employeeList = employees.stream()
                .filter(e -> e.getEmail() != null)
                .filter(e -> e.getName().startsWith("A"))
                .peek(e -> e.setEmail(e.getEmail().toLowerCase()))
                .distinct()
                .collect(Collectors.toUnmodifiableList());

        System.out.println(employeeList);
    }

    public static void main(String[] args) {
        applyOps();
    }
}
