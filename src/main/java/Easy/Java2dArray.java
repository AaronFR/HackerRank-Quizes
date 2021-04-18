package Easy;

import java.util.Scanner;

public class Java2dArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        // YOURS
        // Note the use of Integer.MIN_VALUE for the preffered ultimate low value to start with;
        // Really am out of shape with Matrices, mistook x for being column

        int highestSum = Integer.MIN_VALUE;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                int sum = 0;

                sum = arr[x][y] + arr[x][y+1] + arr[x][y+2] +
                        arr[x+1][y+1] +
                        arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];

                if (sum > highestSum) {
                    highestSum = sum;
                }
            }
        }
        System.out.println(highestSum);

        //

        scanner.close();
    }
}
