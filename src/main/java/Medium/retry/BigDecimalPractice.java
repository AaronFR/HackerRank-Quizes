package Medium.retry;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BigDecimalPractice {

    public static void main(String[] args) {


        String[] s = {
            "-100",
            "50",
            "0",
            "56.6",
            "90",
            "0.12",
            ".12",
            "02.34",
            "000.000"
        };
        int n = 9;

        Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));
        // It should have been obvious that the simplest solution would be to use a comparator not try and create a custom designed sort algorithm.


        // Isn't the best solution actually this one gets stuck in a loop forever.
//        BigDecimal[] sBig = new BigDecimal[s.length];
//        for (int i=0;i<n;i++) {
//            sBig[i] = new BigDecimal(s[i]);
//        }
//
//        boolean noChanges = false;
//        while (!noChanges) {
//            noChanges = true;
//            System.out.println();
//
//            for (int i=1;i<n;i++) {
//
//                if (sBig[i].compareTo(sBig[i-1]) > 0) {
//                    String temp = s[i];
//                    s[i] = s[i-1];
//                    s[i-1] = temp;
//
//                    noChanges = false;
//                    System.out.println(s[i]);
//                }
//            }
//        }
//
//        for (String result : s) {
//            System.out.println(result);
//        }
    }
}
