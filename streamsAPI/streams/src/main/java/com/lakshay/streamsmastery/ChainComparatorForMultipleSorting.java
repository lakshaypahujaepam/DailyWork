package com.lakshay.streamsmastery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChainComparatorForMultipleSorting {

    static class Employee {

        String department;
        String name;
        double salary;

        public Employee(String department, String name, double salary) {
            this.department = department;
            this.name = name;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
                    "department='" + department + '\'' +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    static List<Employee> employeeList = new ArrayList<>();


    static void sortEmployeeViaMultiComparator() {

        employeeList.add(new Employee("IT", "Lakshay", 70000));
        employeeList.add(new Employee("HR", "Rahul", 50000));
        employeeList.add(new Employee("IT", "Ankit", 60000));
        employeeList.add(new Employee("Finance", "Sneha", 80000));
        employeeList.add(new Employee("IT", "Priya", 70000));
        employeeList.add(new Employee("HR", "Karan", 45000));

        List<Employee> emp = employeeList.stream()
                        .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .thenComparing(Employee::getName))
                        .collect(Collectors.toList());

        emp.forEach(e -> System.out.println(e.toString()));
    }

    public static void main(String[] args) {
        sortEmployeeViaMultiComparator();
    }
}
