public class PrimeFactors {
    public static void main(String[] args) {
        int num = 60;

        System.out.print("Prime Factors of " + num + " are: ");
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                // Check if i is prime
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
