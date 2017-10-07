package com.company;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Lesson 4 Exercises
 * Streams and Lambda expressions
 **/

public class Main {

    final static List<Student> students = Arrays.asList(
            new Student("Joe","Clay",1994,Gender.MALE),
            new Student("Marie","Smith",1997,Gender.FEMALE),
            new Student("Ann","Thompson",2000,Gender.FEMALE),
            new Student("James","Bond",1989,Gender.MALE),
            new Student("Jennifer","Atkins",1995,Gender.FEMALE),
            new Student("Cristina","Gibbs",1999,Gender.FEMALE),
            new Student("Jason","Clark",1998,Gender.MALE),
            new Student("Kate","Barrett",1992,Gender.FEMALE),
            new Student("Peter","Garner",1999,Gender.MALE),
            new Student("Ben","Walsh",1996,Gender.MALE)
    );

    //Print the full names of each student.
    public static void runExample() {
        // STREAM produce una copia de la info para trabajar con ella mediante lambda
        // MAP build an array
        // FOREACH travel all the map and insert the instruction () in each line
        students.stream().map(student -> student.getName()).forEach(System.out::println);
    }

    //Print the list of each student's last name in uppercase.
    //Hint: map
    public static void runExercise1() {
        // toUpperCase owns to stream library just do what it say
        students.stream().map(student -> student.getLastName().toUpperCase()).forEach(System.out::println);
    }

    //Print the first name of each male student.
    //Hint: filter
    public static void runExercise2() {
        // FILTER makes a filter according to the given index
        // ARROW means asignment
        // student object will filter by EQUALS expression(MALE)
        // COLLECT save results in a list with the reserved word within parenthesis
        List<Student> maleStudents = students.stream().filter(student -> student.getGender().equals(Gender.MALE)).collect(Collectors.toList());
        maleStudents.stream().map(student -> student.getFirstName()).forEach(System.out::println);
    }

    //Print the full names and age of the first 5 students older than 20 years of age.
    //Hint: limit
    public static void runExercise3() {
        // limit allows me to catch the first 5 match my request
        // FOREACH element in the list(student is a iterable variable) those three attributes will be print
        students.stream().filter(student -> student.getAge() > 20).limit(5).collect(Collectors.toList())
                .forEach(
                        student -> System.out.println(student.getFirstName() + " " +  student.getLastName() + " " + student.getAge())
                );
    }

    //Print the average age of students.
    //Hint: mapToInt average
    public static void runExercise4() {
        // MAPTOINT gets the class student and his inner method getagge
        // AVERAGE makes what its supposed
        // GETASDOUBLE allows me to convert from its special optionaldouble to double
        System.out.println(students.stream().mapToInt(Student::getAge).average().getAsDouble());
    }

    //Print the amount of students who are 22 years old.
    //Hint: count
    public static void runExercise5() {
        System.out.println(students.stream().filter(student -> student.getAge() > 22).count());
    }

    //Print a list of age and student name sorted by age.
    //Hint: sorter
    public static void runExercise6() {
        students.stream().map(student -> student.getAge()+ " " +student.getName()).sorted().forEach(System.out::println);
    }

    //Print a list of students older than 20 years sorted alphabetically with the following format: Lastname, Firstname.
    //Hint: sorter
    public static void runExercise7() {
        students.stream().filter(student -> student.getAge() > 20)
                .map(student -> student.getLastName() + ", " + student.getFirstName()).sorted().forEach(System.out::println);
    }

    //Make a list of objects type integer with the different years when students were born, sorted descendingly.
    //Hint: distinct reverseOrder collect
    public static void runExercise8() {
        List <Integer> years = students.stream().map(student -> student.getBirthYear()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(years);
    }

    public static void main(String[] args) {
        System.out.println("----------Example---------");
        runExample();
        System.out.println("--------Exercise 1--------");
        runExercise1();
        System.out.println("--------Exercise 2--------");
        runExercise2();
        System.out.println("--------Exercise 3--------");
        runExercise3();
        System.out.println("--------Exercise 4--------");
        runExercise4();
        System.out.println("--------Exercise 5--------");
        runExercise5();
        System.out.println("--------Exercise 6--------");
        runExercise6();
        System.out.println("--------Exercise 7--------");
        runExercise7();
        System.out.println("--------Exercise 8--------");
        runExercise8();

        /* ANSWER

        ----------Example---------
        Joe Clay
        Marie Smith
        Ann Thompson
        James Bond
        Jennifer Atkins
        Cristina Gibbs
        Jason Clark
        Kate Barrett
        Peter Garner
        Ben Walsh
        --------Exercise 1--------
        CLAY
        SMITH
        THOMPSON
        BOND
        ATKINS
        GIBBS
        CLARK
        BARRETT
        GARNER
        WALSH
        --------Exercise 2--------
        Joe
        James
        Jason
        Peter
        Ben
        --------Exercise 3--------
        Joe Clay 23
        James Bond 28
        Jennifer Atkins 22
        Kate Barrett 25
        Ben Walsh 21
        --------Exercise 4--------
        21.1
        --------Exercise 5--------
        3
        --------Exercise 6--------
        17 Ann Thompson
        18 Cristina Gibbs
        18 Peter Garner
        19 Jason Clark
        20 Marie Smith
        21 Ben Walsh
        22 Jennifer Atkins
        23 Joe Clay
        25 Kate Barrett
        28 James Bond
        --------Exercise 7--------
        Atkins, Jennifer
        Barrett, Kate
        Bond, James
        Clay, Joe
        Walsh, Ben
        --------Exercise 8--------
        [2000, 1999, 1998, 1997, 1996, 1995, 1994, 1992, 1989]

        */
    }
}