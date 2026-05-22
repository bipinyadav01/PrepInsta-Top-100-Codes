public class PrimeNumbers1To100 {
    public static void main(String[] args) {
        System.out.println("1 se 100 ke beech ke Prime Numbers:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // n/2 tak divide karke check karo
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Agar divide ho gaya toh aage check karne ki zaroorat nahi
                }
            }

            // Agar loop poora chal gaya aur isPrime true raha
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // New line ke liye
    }
}
