package com.gc.controller;

/**
 * Created by Victoria Owen on 3/16/2017.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person p1 = new Person("Antonella", "1570 Woodward");

        System.out.println(p1.toString());


        System.out.println(p1.getName());
        System.out.println(p1.getAddress());

        System.out.println();
        p1.setName("Jeffrey");
        System.out.println(p1.getName());

        Student s1 = new Student("Antonella", "123 Main St", "Java Bootcamp", 2017, 800.00);

        System.out.println(s1.toString());


        Staff p2 = new Staff("Robert Redford", "123 Sundance Trail", "Grand Circus", 8453.22);
        System.out.println(p2.toString());

    }
}