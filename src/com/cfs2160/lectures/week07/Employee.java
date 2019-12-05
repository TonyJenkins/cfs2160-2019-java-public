package com.cfs2160.lectures.week07;

public class Employee {

    private int id;
    private String name;
    private int rating;

    public Employee (int id, String name) {
        this.id = id;
        this.name = name;
        this.rating = 0;
    }

    public Employee (int id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getRating () {
        return rating;
    }

    public void setRating (int rating) {
        this.rating = rating;
    }

    public void increaseRating () {
        this.rating ++;
    }

    @Override
    public String toString () {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public static void main (String[] args) {

        Employee bob = new Employee (1, "Bob", 5);

        System.out.println (bob);

        bob.increaseRating ();

        System.out.println (bob);

    }
}
