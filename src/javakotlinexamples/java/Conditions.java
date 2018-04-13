package javakotlinexamples.java;

public class Conditions {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 4f);
        System.out.println(String.format("%d ist %s",
                num,
                isEven(num) ? "gerade" : "ungerade"));

        switch (num) {
            case 0:
                System.out.println("0");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("1 oder 3");
        }
    }

    public static boolean isEven(int num) {
        return (num % 2) != 1;
    }
}
