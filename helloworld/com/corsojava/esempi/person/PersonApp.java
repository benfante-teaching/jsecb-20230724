package com.corsojava.esempi.person;

public class PersonApp {
    public static void main(String[] args) {
        Person p = new Person("Mario", "Rossi");

        System.out.println(p.getFullName());
        p.setFirstName(null);

    }
}