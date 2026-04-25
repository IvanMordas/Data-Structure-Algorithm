public class Factorial {
    public static int factorial(int fact) {
        if (fact == 0) {
            return 1;
        }
        return fact * (factorial(--fact));
    }
}
