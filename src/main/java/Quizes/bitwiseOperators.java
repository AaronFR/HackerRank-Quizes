package Quizes;

import java.util.Locale;
import java.util.PriorityQueue;

public class bitwiseOperators {

    public static void main(String[] args) {
        // Todo: make a quiz out of this

        System.out.println("And (&) Operator\n");
        int a = 26; // 1 1 0 1 0
        int b = 16; // 1 0 0 0 0
                    // 1 0 0 0 0 // if 1 and 1 -> 1, if 1 and 0 -> 0
        System.out.println(a & b); // should be 16
        System.out.println(a | b); // bitwise or operator, (shows interesting identity operation)

        System.out.println("\nLeft Shift Operator\n");

        System.out.println(3 << 2); // 11 -> 1100 which is 12
        System.out.println(4 << 2);
        System.out.println(5 << 2);

        System.out.println();
        System.out.println(3 << 3); // as in 3 * 8 (i.e 111)
        System.out.println(3 << 1); // as in 3 * 2 (i.e 1) => 111

        System.out.println("\nRight Shift Operator\n");
        System.out.println(8 >> 2); // Should be 1000 -> 10 so 2


        //
        Locale locale = new Locale("USA");
        System.out.println("eeeee" + locale.getCountry()); // wow



        //
        PriorityQueue pq = new PriorityQueue();
        pq.poll();


        //
        //FileReader is = new FileReader("");
        //BufferedReader br = new BufferedReader(new File("")); /invalid
        //(new JavaClass()) what
        //DecimalFormat.getInstance("00.0").format(); huh
    }
}
