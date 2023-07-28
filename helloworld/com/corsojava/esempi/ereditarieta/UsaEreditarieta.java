package com.corsojava.esempi.ereditarieta;

public class UsaEreditarieta {

    public static void main(String[] args) {
        
        B b = new B();
        System.out.println(b);
        System.out.println(b.getClass().getName());
        System.out.println(b.getX());
        System.out.println(b.getY());

        A a = new B();
        System.out.println(a.getX());
        System.out.println(a.getClass().getName());
        if (a instanceof B) {
            B b2 = (B)a;
            System.out.println(b2.getY());
        }

        A a2 = new A();
        B b3 = (B)a2;

    }
}