package com.corsojava.esercizi.chartable;

public class SimpleCharTable {

    public static void main(String[] args) {
        
        for(char c = 'a'; c <= 'z'; c++) {
            System.out.println("'%1$c' = %1$-3d     '%2$c' = %2$-3d".formatted((int) c, c - ('a' - 'A')));
        }
    }
}