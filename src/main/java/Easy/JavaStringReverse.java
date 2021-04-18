package Easy;

public class JavaStringReverse {

    public static void main(String[] args) {
        String A = "java";

        boolean pallindrome = true;
        char[] chars = A.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length -i - 1]) {
                pallindrome = false;
            }
        }

        if (pallindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
