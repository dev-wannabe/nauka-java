package pl.devwannabe.equals_hashcode;

public class StringPool {

    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = new String("abcd");

        System.out.println(s1.equals(s2));

    }

}
