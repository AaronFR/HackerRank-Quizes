package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaAnagrams {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(isAnagramNoFunc("Anagrams", "gramsana"));
    }

    static boolean isAnagram(String a, String b) {
        // Key take-away: Theres no built in method to convert a string to a list of characters
        // ... or for detecting the frequency of characters in a string

        final String aLower = a.toLowerCase();
        final String bLower = b.toLowerCase();

//        a.toCharArray();
//        List<String> aStringList = Arrays.asList((String) aLower.toCharArray()));  // Can't convert String to list of characters easily
        List<String> aStringList = new ArrayList<>();
        for (char ch : aLower.toCharArray()) {
            aStringList.add(String.valueOf(ch));
        }
        Set<String> aUniqueCharacters = new HashSet<>(aStringList);

        List<String> bStringList = new ArrayList<>();
        for (char ch : bLower.toCharArray()) {
            bStringList.add(String.valueOf(ch));
        }
        Set<String> bUniqueCharacters = new HashSet<>(bStringList);

        if (!bUniqueCharacters.equals(aUniqueCharacters)) {
            return false;
        }

        List<Integer> afrequenies = aUniqueCharacters.stream()
                .map(character -> {
                    int frequency = 0;
                    for (String c : aStringList) {
                        if (character.equals(c)) {
                            frequency++;
                        }
                    }

                    return frequency;
                })
                .collect(Collectors.toList());


        List<Integer> bfrequenies = aUniqueCharacters.stream()
                .map(character -> {

                    int frequency = 0;
                    for (String c : aStringList) {
                        if (character.equals(c)) {
                            frequency++;
                        }
                    }
                    return frequency;
                })
                .collect(Collectors.toList());

        if (!afrequenies.equals(bfrequenies)) {
            return false;
        }

        return true;
    }

    static boolean isAnagramNoFunc(String a, String b) {
        // AND HACKERANK DOENS'T WANT SETS OR LISTS, GRRRR
        // You can't compare charArray's converted to Strings, its just a reference.

        final String aLower = a.toLowerCase();
        final String bLower = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        char[] aChars = aLower.toCharArray();
        java.util.Arrays.sort(aChars);
        char[] bChars = bLower.toCharArray();
        java.util.Arrays.sort(bChars);

        for (int i = 0; i < a.length(); i++) {
            if (bChars[i] != aChars[i]) {
                return false;
            }
        }

//        String aSorted = aChars.toString();
//        System.out.println(":" + aSorted + aChars + aLower + a);
//        String bSorted = bChars.toString();
//        if (aSorted.contains(bSorted)) {
//            return true;
//        }

        return true;
    }

}
