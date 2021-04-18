package Quizes;

public class ConcatUnderstanding {

    public static void main(String[] args) {
        String a = "Endicot";
        String b = "works";
        String c = "9 to 5";
        String result;

        /* This doesn't work, remember why?
        result = concat(a).concat(b).concat(c)
         */

        result = a.concat(b.concat(c));
    }
}
