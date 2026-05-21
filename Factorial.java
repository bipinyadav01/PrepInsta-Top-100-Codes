public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        int fact = 1;

        
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
