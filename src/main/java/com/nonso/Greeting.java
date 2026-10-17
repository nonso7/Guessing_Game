package com.nonso;

public class Greeting {
    private String name;

    public Greeting(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello " + name + "!");
    }
}
