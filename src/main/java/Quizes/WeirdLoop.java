package Quizes;

public class WeirdLoop {
    // Take a guess at what the output is, theres some tricks to do with scoping.

    private static final int i = 99;
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) { // line n1
            System.out.print(i);
            i++; // line n2
            break;
        }
        System.out.print(i);
    }
}
