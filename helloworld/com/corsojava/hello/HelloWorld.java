package com.corsojava.hello;

import com.corsojava.biblioteca.*;

public class HelloWorld {

    public static void main(String[] a) {
        System.out.println(hello());

        Libro.printLibro();
    }

    static String hello() {
        return "Hello, World!";
    }
}
