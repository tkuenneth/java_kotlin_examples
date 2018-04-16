package javakotlinexamples.java;

public class POJO {

    private static long counter = 0;

    private String aString;
    private int anInt;

    public POJO(boolean aBoolean) {
        this(aBoolean ? "MATHEMA" : "Campus,",
                aBoolean ? 3 : 4);
    }

    public POJO(String aString, int anInt) {
        this.aString = aString;
        this.anInt = anInt;
        System.out.println(counter++);
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public String getaString() {
        return aString;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public int getAnInt() {
        return anInt;
    }

    public int getComputedValue() {
        return anInt * anInt;
    }
}
