package com.corsojava.esempi.eccezioni;

import java.io.IOException;

public class EccezioniExample {

    public static void main(String[] args) {
        try {
            prova1();
        } catch (NullPointerException e) {
            System.out.println("Eccezione catturata: " + e);
        }

        try {
            prova2();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void prova1() {
        String s = null;
        System.out.println(s.toUpperCase());
    }

    public static void prova2() throws IOException {
        throw new IOException("Errore facendo io");
    }
}