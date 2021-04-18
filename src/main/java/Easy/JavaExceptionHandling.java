package Easy;

public class JavaExceptionHandling {

    long power(int n, int p) throws Exception{
        // The throws Exception has to be there or the code itself throws an error during compliling:
        // "Unreported exception" Basically an Exception is an object, errors don't need classifying obivously they just happen
        // But a user created error has to be declared as instantiating the Exception class.

        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        return (long) Math.pow(n, p);
    }

}
