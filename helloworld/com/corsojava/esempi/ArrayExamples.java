package com.corsojava.esempi;

public class ArrayExamples {
    public static void main(String[] args) {
        
        int[][] matrix = new int[][] {
            new int[] {1, 2, 3},
            new int[] {4, 6}
        };

        for(int i=0; i < matrix[1].length; i++) {
            System.out.println(matrix[1][i]);
        }
    }
}
