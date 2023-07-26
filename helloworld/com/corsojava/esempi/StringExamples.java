package com.corsojava.esempi;

public class StringExamples {

    public static void main(String[] args) {
        
        String s = "Lucio Benfante";
        System.out.println(s.length());

        char primo = s.charAt(0);
        System.out.println(primo);
        char ultimo = s.charAt(s.length() - 1);
        System.out.println(ultimo);
        int a = s.charAt(0);
        System.out.println(a);
        char c2 = (char)(a + 1);
        System.out.println(c2);

        char c3 = c2++; // 

        int b = (int)3.14F;
        System.out.println(b);
        double d = 3;
        double d2 = 3.14F;
        float f = (float)3.14;

        short s1 = 3;
        short s2 = 4;

        short s3 = (short)(s1 + s2);

        long l = 123_456_789_012L; 
        int i = (int)l;
        System.out.println(i);

        String str2 = "Mario Rossi";
        System.out.println(s.compareTo(str2));

        String str3 = str2;

        System.out.println(str3.equals(str2));
        System.out.println(str3 == str2);

        System.out.println(s.indexOf('B'));
        System.out.println(s.indexOf("Ben"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("e", 8));

        System.out.println(s.replace('e', 'k'));

        System.out.println(s.substring(6, 9));

        System.out.println(s.toLowerCase());
        System.out.println(s);

        s = s.toLowerCase();

        String str4 = "Età: " + a + " anni e peso " + 60 + " kili";
        String str5 = String.format("Età: %d anni e peso %d kili", a, 60);
        String str6 = "Età: %d anni e peso %d kili".formatted(a, 60);
        String str7 = "Peso: %2$d , Età: %1$d".formatted(a, 60);

        System.out.println(str7);

        String str8 = "SELECT * FROM person\n" + 
                        " WHERE name LIKE 'a%'\n" +
                        " AND age > " + 18 + "\n" +
                        " ORDER BY name";

        String str9 = """
            SELECT * FROM person
                WHERE name LIKE 'a%%'
                    AND age > %d
                ORDER BY name
            """.formatted(18);
        System.out.println(str9);
    }
}