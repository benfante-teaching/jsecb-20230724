package com.corsojava.esempi.ereditarieta;

public class B extends A {
    
    private int y = 20;
    
    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "B [y=" + y + "] " + " x = " + x;
    }
}