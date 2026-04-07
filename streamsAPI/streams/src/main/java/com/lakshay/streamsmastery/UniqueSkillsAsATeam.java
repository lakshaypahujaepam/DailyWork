package com.lakshay.streamsmastery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueSkillsAsATeam {

    static class Developer {
        private String name;
        private List<String> skills;

        public Developer(String name, List<String> skills) {
            this.name = name;
            this.skills = skills;
        }

        public List<String> getSkills() {
            return skills;
        }
    }

    static List<Developer> developers = Arrays.asList(
            new Developer("Lakshay", Arrays.asList("Java", "Spring", "Hibernate")),
            new Developer("Rahul", Arrays.asList("Java", "React", "Docker")),
            new Developer("Ankit", Arrays.asList("Python", "Django", "Docker")),
            new Developer("Sneha", Arrays.asList("Java", "Spring", "Microservices")),
            new Developer("Priya", Arrays.asList("React", "JavaScript", "CSS")),
            new Developer("Karan", Arrays.asList("Go", "Kubernetes", "Docker"))
    );

    static void uniqueSkillsAsATeam() {

        List<String> uniqueSkills = developers.stream()
                .flatMap(developer -> developer.getSkills().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(uniqueSkills);

    }

    public static void main(String[] args) {
        uniqueSkillsAsATeam();
    }
}
