package Easy;

import java.util.*;

public class BitSets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitSetLength = scanner.nextInt();
        int numOperations = scanner.nextInt();

        BitSet b1 = new BitSet(bitSetLength);
        BitSet b2 = new BitSet(bitSetLength);

//        List<BitSet> bitSets = new ArrayList<>();  // The neatest way is actually to use a simple array BitSet[] but its still neat enough.
        BitSet[] bitSets = new BitSet[3];  // So I had a 3 of 9 tests failing with the above and I can't tell why exactly which means no discrete lesson.
        // Can take away that the one that works is in line with KISS.
        // -> Don't forget that Object[] exists and can be simpler to read than ArrayLists<Object> !
        bitSets[1] = b1;
        bitSets[2] = b2;

        while (0 < numOperations--) {  // found this in the solutions, very neat.
            String operation = scanner.next();
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            switch (operation) {
                case "AND":
                    bitSets[num1].and(bitSets[num2]);
                    break;  // What was causing a problem is that switch statements are designed so that if there isn't a break THEY WILL GO THROUGH ALL THE FOLLOWING CASES
                    // you haven't noticed this before because you used returns in you're switch statements.
                case "OR":
                    bitSets[num1].or(bitSets[num2]);
                    break;
                case "XOR":
                    bitSets[num1].xor(bitSets[num2]);
                    break;
                case "FLIP":
                    bitSets[num1].flip(num2);
                    break;
                case "SET":
                    bitSets[num1].set(num2);
                    break;
            }

            System.out.println(bitSets[1].cardinality() + " " + bitSets[2].cardinality());
        }

    }
}
