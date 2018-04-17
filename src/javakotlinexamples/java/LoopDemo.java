package javakotlinexamples.java;

public class LoopDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        for (int i = 6; i >= 0; i -= 2) {
            System.out.println(i);
        }

        var array = new String [] {"Eins", "Zwei", "Drie"};
        for (var s : array) {
            System.out.println(s);
        }
    }
}
