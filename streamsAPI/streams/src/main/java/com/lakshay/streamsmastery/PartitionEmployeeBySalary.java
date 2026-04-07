package com.lakshay.streamsmastery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeeBySalary {

    public static class Employee {
        int id;
        double salary;

        Employee(int id, double salary) {
            this.id = id;
            this.salary = salary;
        }

        double getSalary() {
            return this.salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", salary=" + salary +
                    '}';
        }
    }


    static List<Employee> employees = new ArrayList<>();
    static void getSalaryGroupedEmployees() {
        employees.add(new Employee(1, 20000.00));
        employees.add(new Employee(2, 50000.00));
        employees.add(new Employee(3, 50001.00));
        employees.add(new Employee(4, 70000.00));

        Map<Boolean, List<Employee>> emps = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 50000.00));

        emps.forEach((k, v) -> {
            System.out.println(k +" : " + v);
        });

    }

    public static void main(String[] args) {
        getSalaryGroupedEmployees();
    }
}
