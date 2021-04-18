package Easy;

import java.util.Scanner;

public class JavaPrimality {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isPrime = scanner.nextBigInteger().isProbablePrime(1);
        scanner.close();

        if (isPrime) {
            System.out.println("prime");
        } else
            System.out.println("not prime");
    }
}