package Quizes;

public class StringManipulationIntermediate {

    public static void main(String[] args) {
        // Take a guess at what it prints, you should be able to figure out why you're first was wrong.

        String s = "abc";
        s = s + 1 + 2;
        s = s + (2 + 2);
        s.concat("1").concat("2");
        s.concat("" + 2 + 2);
        System.out.print(s);
    }

}
