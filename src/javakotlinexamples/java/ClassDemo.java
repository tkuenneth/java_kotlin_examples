package javakotlinexamples.java;

public class ClassDemo {

    public static void main(String[] args) {
        POJO pojo = new POJO("Hallo", 1);
        pojo.setaString("MATHEMA");
        pojo.setAnInt(42);
        print(pojo);

        pojo = new POJO(false);
        print(pojo);

        pojo = new POJO(true);
        print(pojo);
    }

    private static void print(POJO pojo) {
        System.out.println(String.format("%s, %d",
                pojo.getaString(),
                pojo.getComputedValue()));
    }
}
