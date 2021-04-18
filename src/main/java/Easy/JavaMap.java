package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaMap {

    public static void main(String[] args) {
        // Only thing that threw me off is that scanner.nextLine() doesn't work the way you think it does with conjunction to the other methods.
        // .nextInt() will take the next number it finds on the line. But it stays on the line.
        // .nextLine() will move the scanner, will read the rest of the line, rather than the litteral next line. So readLine() might be better.


        Set<String[]> newSet = new HashSet<>();
        String[] test = new String[2];
        newSet.add(test);

        Scanner scanner = new Scanner(System.in);
        int entries = scanner.nextInt();
        scanner.nextLine();

        HashMap<String, Integer> phoneNumbers = new HashMap<>();

        while (entries > 0) {
            String inputName = scanner.nextLine();
            int inputPhoneNumber = scanner.nextInt();
            scanner.nextLine();

            phoneNumbers.put(inputName, inputPhoneNumber);
            entries--;
        }

        while (scanner.hasNext()) {
            String s = scanner.nextLine();

            if (phoneNumbers.containsKey(s)) {
                System.out.println(s + "=" + phoneNumbers.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
