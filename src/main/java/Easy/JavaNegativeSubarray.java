package Easy;

import java.util.Scanner;

public class JavaNegativeSubarray {

    public static void main(String[] args) {
        // So I'm writing this because of the intense time it took to see what was wrong. -> I blame not being able to debug.
        // Also because I wrote this during the SpaceX launch.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        int count = 0;
        for (int j=0;j<n;j++) {
            int sum=0;
            for(int k=j; k<n; k++) { // this n was set to j and it took me 20mins to spot
                sum = array1[k] + sum;
                if (sum<0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
