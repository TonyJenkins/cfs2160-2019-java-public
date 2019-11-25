package com.cfs2160.greeters;

public class HelloWorld {

    public HelloWorld () {
        this.sayHelloWorld ();
    }

    public void sayHelloWorld () {
        System.out.println ("Hello, World");
    }

    public static void main (String[] args) {
        new HelloWorld ();
    }
}
