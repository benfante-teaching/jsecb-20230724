public class VariableExamples {
    public static int b = 10;

    public int a;

    public void foo(int c, int d, int a) {
        System.out.println(a);
        int i;

        if (a > 10) {
            int j = 1000;
            System.out.println(j);
            i = 60;
            //int a = 23;
            System.out.println(a);
            System.out.println(this.a);
        } else {
            i = 70;
        }
        System.out.println(a);
        System.out.println(i);

        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        System.out.println(VariableExamples.b);
        VariableExamples.b = 20;
        System.out.println(VariableExamples.b);

        VariableExamples v1 = new VariableExamples();
        System.out.println(v1.a);
        v1.a = 40;
        System.out.println(v1.a);

        VariableExamples v2 = new VariableExamples();
        System.out.println(v2.a);
        v2.a = 5;

        v1.foo(100, 200, 5000);
        v2.foo(300, 400, 6000);

    }
}