public class SumOfTwoPrimes {

    // Number prime hai ya nahi check karne ka helper function
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; // Agar divide ho gaya toh prime nahi hai
            }
        }
        return true; // Varna prime hai
    }

    public static void main(String[] args) {
        int n = 14; // Test number
        boolean found = false;

        // Loop n/2 tak chalega kyunki uske baad pairs repeat hone lagenge
        for (int i = 2; i <= n / 2; i++) {
            // Check karo agar i aur (n - i) dono prime hain
            if (checkPrime(i) && checkPrime(n - i)) {
                System.out.println(n + " can be expressed as the sum of " + i + " and " + (n - i));
                found = true;
                break; // Ek pair milte hi loop rok do
            }
        }

        if (!found) {
            System.out.println(n + " cannot be expressed as the sum of two prime numbers.");
        }
    }
}
