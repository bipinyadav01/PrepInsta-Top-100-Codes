public class NthFibonacciTerm {
    public static void main(String[] args) {
        int n = 6; // Kaunsa term chahiye (e.g., 6th term)
        int a = 0, b = 1;
        int nthTerm = 0;

        if (n == 1) nthTerm = a;
        else if (n == 2) nthTerm = b;
        else {
            for (int i = 3; i <= n; i++) {
                nthTerm = a + b;
                a = b;
                b = nthTerm;
            }
        }

        System.out.println("The " + n + "th term of Fibonacci Series is: " + nthTerm);
    }
}
