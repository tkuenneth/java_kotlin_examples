package javakotlinexamples.java;

import java.util.Objects;

public class NullSafety {

    public static void main(String[] args) {
        String s1 = "Campus";
        System.out.println(s1.length());

        String stringThatCanBeNull = null;
        // causes java.lang.NullPointerException
        //System.out.println(stringThatCanBeNull.length());

        var l1 = stringThatCanBeNull != null
                ? stringThatCanBeNull.length()
                : -1;
        System.out.println(l1);

        // since Java 9
        var safeString = Objects.requireNonNullElse(stringThatCanBeNull, new String());
        System.out.println(safeString.length());
    }
}
