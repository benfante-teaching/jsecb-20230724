package com.corsojava.esercizi.swap;

public class SwapVariables {
    int a, b;

    public SwapVariables(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        // int tmp = a;
        // a = b;
        // b = tmp;
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public static void main(String[] args) {
        int v1 = Integer.parseInt(args[0]);
        int v2 = Integer.parseInt(args[1]);
        SwapVariables sv = new SwapVariables(v1, v2);
        sv.swap();
        System.out.println(sv.a); // -> 4
        System.out.println(sv.b); // -> 3
    }
}