package com.lakshay.comparatorVsComparableImplementation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    static List<Student> students = Arrays.asList(
            new Student(1, "Rahul", 22, 85),
            new Student(2, "Aman", 21, 92),
            new Student(3, "Karan", 22, 85),
            new Student(4, "Zoya", 20, 92)
    );

    public static List<Student> sortOnConditions() {
        return students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed()
                        .thenComparing(Student::getAge)
                        .thenComparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static void print(Student s) {
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getMarks() + " ::");
    }

    public static void main(String[] args) {
        List<Student> st = sortOnConditions();
        for(Student s : st) {
            print(s);
        }
    }
}
