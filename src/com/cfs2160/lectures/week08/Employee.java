package com.cfs2160.lectures.week08;

public class Employee {

    final static int MAX_RATING = 10;

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

    public boolean increaseRating () {


        if (this.getRating () < MAX_RATING) {
            this.rating++;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString () {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

}
