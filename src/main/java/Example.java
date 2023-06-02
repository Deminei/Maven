public class Example {
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The number must be non-negative.");
        }

        long fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
