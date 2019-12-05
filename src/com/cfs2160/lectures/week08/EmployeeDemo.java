package com.cfs2160.lectures.week08;

public class EmployeeDemo {

    public static void main (String[] args) {

        Employee bob = new Employee (1, "Bob", 10);

        System.out.println (bob);

        if (!bob.increaseRating ()) {
            System.out.println ("That didn't work.");
        }

        System.out.println (bob);

    }

}
