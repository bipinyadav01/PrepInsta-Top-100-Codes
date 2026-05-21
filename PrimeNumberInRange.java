public class PrimeNumberInRange {
    public static void main(String[] args) {
        int start = 2;
        int end = 10;

        System.out.println(start + " se " + end + " prime numbers:");
        
        for (int i = start; i <= end; i++) {
            if (i == 2) {
                System.out.print(i + " ");
            } else if (i > 2) {
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
