public class FactorOfNumber {
    public static void main(String[] args) {
        int num = 10;

        System.out.print("Factors of " + num + " are: ");
        // Notes logic: i=1 se lekar n/2 tak 
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(num); 
    }
}
