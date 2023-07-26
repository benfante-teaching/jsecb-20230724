package com.corsojava.esempi;

public class OperatorExamples {
    public static void main(String[] args) {
        
        int a = 10, b = 4;
        System.out.println("a + b = " + a + b);
        System.out.printf("a + b = %d%n", a + b);
        System.out.printf("a - b = %d%n", a - b);
        System.out.printf("a * b = %d%n", a * b);
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a / 4.0 = " + (a / 4.0));
        System.out.println("a / b = " + (a / (double)b));
        System.out.println("a++ = " + (a++)); // a = a + 1
        System.out.println("a  = " + a);
        System.out.println("a++ = " + (++a)); // a = a + 1
        a += 20; // a = a + 20
        System.out.println("2 << 1 = " + (2 << 1)); // 0000000010 -> 0000000100
        boolean c = true;
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));    
        System.out.println("false || false = " + (false || false));    
        System.out.println("!true = " + (!true));
        System.out.println("false & true = " + (false & a++ > 30));
        System.out.println("true | false = " + (true | a++ > 30));

        String s = null;
        System.out.println("lunghezza > 10 = " + (s != null && s.length() > 10));

        if (s != null && s.length() > 10) {
            // fai qualcosa
        }

        System.out.println("a > 10 ? " + (a > 10 ? "SI" : "NO"));

        String result = null;
        if (a > 10) {
            result = "SI";
        } else {
            result = "NO";
        }

        result = (a > 10 ? "SI" : "NO");
    }
}