package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listLength = scanner.nextInt();

        List<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            listInteger.add(scanner.nextInt());
        }

        // Inefficient. Also Code Smells == java just really doesn't like trying to remove the side parts
//        String listToParse = scanner.nextLine();
//        List<String> listString = Arrays.asList(listToParse.split(" "));
//        listString.remove(0);
//        listString.remove(listLength);
//
//        List<Integer> listInteger = new ArrayList<>();
//        for (String s : listString) {
//            listInteger.add(Integer.valueOf(s));
//        }

        int numQueries = scanner.nextInt();

        while (numQueries > 0) {

            if (scanner.nextLine() == "Insert") {
                List<String> queryString = Arrays.asList(scanner.nextLine().split(" "));
                List<Integer> queryInteger = new ArrayList<>();
                for (String q : queryString) {
                    queryInteger.add(Integer.valueOf(q));
                }

                listInteger.add(queryInteger.get(0), queryInteger.get(1));
            } else {
                int elementToDelete = scanner.nextInt();
                if (elementToDelete < 0 || elementToDelete > listLength)
                    listInteger.remove(scanner.nextInt());
            }

            numQueries--;
        }

        String toPrint = "";
        for (Integer element : listInteger) {
            toPrint = toPrint + String.valueOf(element) + " ";
        }
        System.out.println(toPrint.trim());
    }

    public static void cleanerMethod() {
        // Main problem was in trying to hash things out without understanding.
        // 1 : Knowing that .nextInt() stays on the same line, saves so much code.
        // 2 : Knowing that scanner.nextLine() can fail where scanner.next() doesn't.
        // but it's not the one off's its about taking the time to actually understand what you're doing.

        Scanner scanner = new Scanner(System.in);

        int listLength = scanner.nextInt();
        List<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            int value = scanner.nextInt();
            listInteger.add(value);
        }

        int numQueries = scanner.nextInt();
        while (numQueries > 0) {

            String query = scanner.next();
            if (query.equals("Insert")) {
                int index = scanner.nextInt();
                int numberToAdd = scanner.nextInt();

                listInteger.add(index, numberToAdd);
            } else {
                int elementToDelete = scanner.nextInt();

                // This causes some failures, presumably bacause while a good idea while assuming you'll actually get an int
                // they probally throw nulls at you.
                if (elementToDelete >= 0 && elementToDelete <= listLength) {
                    listInteger.remove(elementToDelete);
                }
            }

            numQueries--;
        }
        scanner.close();

        String toPrint = "";
        for (Integer element : listInteger) {
            toPrint = toPrint + String.valueOf(element) + " ";
        }
        System.out.println(toPrint);
    }
}
