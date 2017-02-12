package chapter1.section1;

/**
 * Created by Tyrone on 2/12/2017.
 */
public class Exercise20 {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative numbers are not real numbers");
        }
        if (n > 1) {
            return factorial(n - 1) * n;
        }
        return 1;
    }
}
