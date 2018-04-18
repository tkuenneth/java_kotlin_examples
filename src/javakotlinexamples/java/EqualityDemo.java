package javakotlinexamples.java;

public class EqualityDemo {

    public static void main(String[] args) {
        var a = "Hallo Campus";
        var b = new String(a);

        // referential equality
        System.out.println(String.format("a == b: %b", a == b));

        // structural equality
        System.out.println(String.format("a.equals(b): %b", a.equals(b)));
    }
}
