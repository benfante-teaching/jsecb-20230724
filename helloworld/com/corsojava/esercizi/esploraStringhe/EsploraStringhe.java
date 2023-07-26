package com.corsojava.esercizi.esploraStringhe;

public class EsploraStringhe {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nessun argomento");
            return;
        }
        System.out.println("Lunghezza: %d".formatted(args[0].length()));
        System.out.println("Primo carattere: %c".formatted(args[0].charAt(0)));
        System.out.println("Ultimo carattere: %c".formatted(args[0].charAt(args[0].length() - 1)));
        System.out.println("Maiuscolo: %s".formatted(args[0].toUpperCase()));

        System.out.println("Invertita: %s".formatted(new StringBuilder(args[0]).reverse().toString()));
        
    }
}