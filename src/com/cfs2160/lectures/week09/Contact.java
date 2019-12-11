package com.cfs2160.lectures.week09;

public class Contact {

    private String name;
    private String number;

    public Contact () {
    }

    public Contact (String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getNumber () {
        return number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    @Override
    public String toString () {
        return "Name: " + this.name + ", Number: " + this.number;
    }
}
