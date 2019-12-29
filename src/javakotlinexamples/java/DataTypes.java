package javakotlinexamples.java;

public class DataTypes {

    public static void main(String[] args) {
        float a = 123.45f;
        double b = 123.45;
        long c = 1;
        int d = 2;
        short e = 3;
        byte f = 4;
        var g = true;
        print(a);
        print(b);
        print(c);
        print(d);
        print(e);
        print(f);
        print(g);
    }

    private static void print(Object n) {
        System.out.println(n.getClass().getName());
    }
}
