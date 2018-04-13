package javakotlinexamples.java;

public class HelloOO {

    public static void main(String[] args) {
        new Greeter(args[0]).greet();
    }

    public static class Greeter {

        private String name;

        public Greeter(String name) {
            this.name = name;
        }

        public void greet() {
            System.out.println(String.format("Hallo, %s", name));
        }
    }
}
