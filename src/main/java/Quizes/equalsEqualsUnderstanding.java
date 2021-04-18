package Quizes;

public class equalsEqualsUnderstanding {

    public static void main(String[] args) {
        // Take a guess at the output

        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(b==c);
    }
}
